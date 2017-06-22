package com.sbu.controller;

import com.sbu.controller.model.MessageModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by user on 6/21/2017.
 */
@Controller
@RequestMapping(value = "message")
public class MessageController {

    @RequestMapping(method = RequestMethod.GET)
    public String initMessage(Model model){
        model.addAttribute("msg","Show this hamidreza");
        return "inbox";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String controlMessage(Model model, @ModelAttribute("messageModel")MessageModel messageModel){

        return "inbox";
    }
}
