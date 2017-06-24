package com.sbu.controller;

import com.sbu.controller.model.PeriodicHelpCashModel;
import com.sbu.controller.model.PeriodicHelpDTO;
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
        PeriodicHelpDTO dto=new PeriodicHelpDTO();
        Integer predicateCount=0;

        if (!periodicHelpCashModel.getFirstName().isEmpty())
        {
            helperEntity.setName(periodicHelpCashModel.getFirstName());
            predicateCount++;
        }

        if(!periodicHelpCashModel.getLastName().isEmpty()){
            helperEntity.setFamily(periodicHelpCashModel.getLastName());
            predicateCount++;
        }
        if(!periodicHelpCashModel.getOccupation().isEmpty())
            helperEntity.setOccupation(periodicHelpCashModel.getOccupation());
        if(periodicHelpCashModel.isProfessor() && !periodicHelpCashModel.getFacultyName().isEmpty())
            if (periodicHelpCashModel.getFacultyName().equals("other"))
                helperEntity.setProfessorCollege(periodicHelpCashModel.getOtherFacultyName());
            else
                helperEntity.setProfessorCollege(periodicHelpCashModel.getFacultyName());
        if(!periodicHelpCashModel.getPhoneNumber().isEmpty()){
            helperEntity.setPhoneNumber(periodicHelpCashModel.getPhoneNumber());
            predicateCount++;
        }
        if(!periodicHelpCashModel.getEmail().isEmpty())
            helperEntity.setEmail(periodicHelpCashModel.getEmail());
        if(!periodicHelpCashModel.getTimePeriod().isEmpty()){
            helperEntity.setHelpPeriod(periodicHelpCashModel.getTimePeriod());
            predicateCount++;
        }
        if(!periodicHelpCashModel.getCostOfPay().isEmpty()){
            helperEntity.setCostOfPay(periodicHelpCashModel.getCostOfPay());
            predicateCount++;
        }
        if(!periodicHelpCashModel.getPassword().isEmpty() && !periodicHelpCashModel.getPasswordRepeat().isEmpty())
            if(periodicHelpCashModel.getPassword().equals(periodicHelpCashModel.getPasswordRepeat())){
                helperEntity.setPassword(periodicHelpCashModel.getPassword());
                predicateCount+=2;
            }
        dto.setFilled(helperEntity);

        if (predicateCount!=7)// incomplete required input
        {
            dto.setState(0);
        }
        else {
        }



        return "";
    }

}
