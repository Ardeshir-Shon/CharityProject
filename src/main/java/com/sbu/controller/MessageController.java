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
@RequestMapping(value = "/message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @RequestMapping(method = RequestMethod.GET)
    public String initMessage(Model model){
        model.addAttribute("msg","Show this hamidreza");
        return "inbox";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String controlMessage(Model model, @ModelAttribute("messageModel")MessageModel messageModel){

        MessageEntity messageEntity=new MessageEntity();
        if (messageModel.getName() !=null && messageModel.getTitle() != null && messageModel.getBody() != null){
            messageEntity.setName(messageModel.getName());
            messageEntity.setSubject(messageModel.getTitle());
            messageEntity.setText(messageModel.getBody());
        }
        else{
            model.addAttribute("errorfill","اطلاعات را کاملا وارد کنید.");
            return "inbox";
        }
        //if (messageModel.get)
        return "inbox";
    }
}
