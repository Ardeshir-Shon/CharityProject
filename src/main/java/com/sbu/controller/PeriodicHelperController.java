package com.sbu.controller;

import com.sbu.controller.model.PeriodicHelpCashModel;
import com.sbu.dao.model.HelperEntity;
import com.sbu.service.HelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by user on 6/23/2017.
 */
@Controller
@RequestMapping(value = "/periodHelp")
public class PeriodicHelperController {

    @Autowired
    HelperService helperService;

    @RequestMapping(method = RequestMethod.GET)
    public String periodHelpPage(){
        return "periodicHelp";
    }

    @RequestMapping(value = "/cash" , method = RequestMethod.POST)
    public String periodHelpSubmit(Model model, @ModelAttribute("periodicHelpCashModel")PeriodicHelpCashModel periodicHelpCashModel){

        HelperEntity helperEntity=new HelperEntity();

        if (!periodicHelpCashModel.getFirstName().isEmpty())
            helperEntity.setName(periodicHelpCashModel.getFirstName());

        return "";
    }

}
