package com.sbu.controller;

import com.sbu.service.NeedyStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by user on 6/24/2017.
 */
@Controller
public class NeedyStudentController {
    @Autowired
    NeedyStudentService needyStudentService;

    @RequestMapping(method = RequestMethod.GET)
    public String needyStudentPage(){
        return "needyStudents";
    }

}
