package com.sbu.controller;

import com.sbu.controller.model.MessageModel;
import com.sbu.dao.model.MessageEntity;
import com.sbu.service.MessageService;
import com.sun.org.apache.xpath.internal.operations.Bool;
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
        if (messageModel.getName() !=null && messageModel.getTitle() != null && messageModel.getBody() != null){

            messageEntity.setName(messageModel.getName());
            messageEntity.setSubject(messageModel.getTitle());
            messageEntity.setText(messageModel.getBody());
            //model.addAttribute("state",new Boolean(true));
            state=true;
        }
        else{// fill necessary incorrect
            //model.addAttribute("state",new Boolean(false));
            state=false;
            //return "inbox";
        }
        if(state && messageModel.isTendency()){// want to contribute and filled top true
            if (messageModel.getPhoneNumber()!=null || messageModel.getEmail()!=null){// correct
                if (messageModel.getPhoneNumber()!=null)
                    messageEntity.setPhone_number(messageModel.getPhoneNumber());
                if (messageModel.getEmail()!=null)
                    messageEntity.setEmail(messageModel.getEmail());
                //model.addAttribute("state",new Boolean(true));
                state=true;
            }
            else{// for more contribute, at least fill phone or email
                //model.addAttribute("state",new Boolean(false));
                state=false;
                //return "inbox";
            }
        }
        if (state) {
            messageService.insertMessage(messageEntity);
        }
        model.addAttribute("state",state);

        return "inbox";
    }
}
