package com.sbu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 6/24/2017.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {

    public String homePage(){
        return "home";
    }
}
