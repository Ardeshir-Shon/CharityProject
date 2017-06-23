package com.sbu.controller;

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
        Boolean state=null;
        MessageEntity messageEntity=new MessageEntity();
        if (!messageModel.getName().isEmpty() && !messageModel.getTitle().isEmpty() && !messageModel.getBody().isEmpty()){

            messageEntity.setName(messageModel.getName());
            messageEntity.setSubject(messageModel.getTitle());
            messageEntity.setText(messageModel.getBody());
            state=true;
        }
        else{// fill necessary incorrect
            state=false;
        }
        if(state && messageModel.isTendency()){// want to contribute and filled top true
            if (!messageModel.getPhoneNumber().isEmpty() || !messageModel.getEmail().isEmpty()){// correct
                if (!messageModel.getPhoneNumber().isEmpty())
                    messageEntity.setPhoneNumber(messageModel.getPhoneNumber());
                if (!messageModel.getEmail().isEmpty())
                    messageEntity.setEmail(messageModel.getEmail());
                state=true;
            }
            else{// for more contribute, at least fill phone or email
                state=false;
            }
        }
        if (state) {
            messageService.insertMessage(messageEntity);
        }
        model.addAttribute("state",state);
        return "inbox";
    }
}
