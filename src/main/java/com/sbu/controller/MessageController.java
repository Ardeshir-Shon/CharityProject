package com.sbu.controller;

import com.sbu.controller.DTO.GenericDTO;
import com.sbu.controller.model.MessageModel;
import com.sbu.dao.model.MessageEntity;
import com.sbu.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by user on 6/21/2017.
 */
@Controller
@RequestMapping(value = "/inbox")
public class MessageController {

    @Autowired
    MessageService messageService;

    @RequestMapping(method = RequestMethod.GET)
    public String initMessage(Model model){
        model.addAttribute("msg","Show this hamidreza");
        return "inbox";
    }

    @RequestMapping(value="/message" , method = RequestMethod.POST)
    public String controlMessage(Model model, @ModelAttribute("messageModel")MessageModel messageModel){

        GenericDTO<MessageEntity> dto = new GenericDTO<>();
        MessageEntity messageEntity=new MessageEntity();

        if (!messageModel.getFirstName().isEmpty()){
            messageEntity.setName(messageModel.getFirstName());
        }

        if (!messageModel.getTitle().isEmpty()){
            messageEntity.setSubject(messageModel.getTitle());
        }

        if (!messageModel.getBody().isEmpty()){
            messageEntity.setText(messageModel.getBody());
        }

        if (!messageModel.getFirstName().isEmpty() && !messageModel.getTitle().isEmpty() && !messageModel.getBody().isEmpty()){
            dto.setState(1); // ok required inputs.
        }
        else{// fill necessary incorrect
            dto.setState(0); // incomplete required input.
            dto.setFilled(messageEntity);
            model.addAttribute("dto",dto);
            return "inbox";
        }
        if(dto.getState()==1 && messageModel.isTendency()){// want to contribute and filled top true
            if (!messageModel.getPhoneNumber().isEmpty() || !messageModel.getEmail().isEmpty()){// correct
                if (!messageModel.getPhoneNumber().isEmpty())
                    messageEntity.setPhoneNumber(messageModel.getPhoneNumber());
                if (!messageModel.getEmail().isEmpty())
                    messageEntity.setEmail(messageModel.getEmail());
            }
            else{// for more contribute, at least fill phone or email
                dto.setState(2); // enter email or phone
            }
        }
        boolean insert=false;
        if (messageService.validation(messageEntity) && dto.getState()==1) {
            insert=messageService.insertMessage(messageEntity);
            if (!insert)
                dto.setState(-1);
        }
        else
            dto.setState(-1);
        dto.setFilled(messageEntity);
        model.addAttribute("dto",dto);
        return "inbox";
    }
}
