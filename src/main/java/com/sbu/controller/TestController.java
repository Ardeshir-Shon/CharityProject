package com.sbu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by user on 6/20/2017.
 */
@Controller
public class TestController {
    @RequestMapping(value ="/hamidreza" ,  method= RequestMethod.GET)
    public String  init(Model model){
        model.addAttribute("name","shojaeenasab");
        model.addAttribute("age",22);
        model.addAttribute("id","Ardeshir-Shon");
        return "studentinfo";
    }
}
