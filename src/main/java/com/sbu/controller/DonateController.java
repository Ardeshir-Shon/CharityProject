package com.sbu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by user on 6/24/2017.
 */
@Controller
@RequestMapping(value = "/donate")
public class DonateController {

    @RequestMapping(method = RequestMethod.GET)
    public String donatePage(){
        return "donate";
    }
}
