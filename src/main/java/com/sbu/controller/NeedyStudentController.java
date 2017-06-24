package com.sbu.controller;

import com.sbu.controller.DTO.GenericDTO;
import com.sbu.controller.model.NeedyStudentModel;
import com.sbu.dao.model.NeedyStudentEntity;
import com.sbu.service.NeedyStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @RequestMapping(value = "/main" , method = RequestMethod.POST)
    public String needySubmit(Model model, @ModelAttribute("needyStudentModel")NeedyStudentModel needyStudentModel){

        GenericDTO<NeedyStudentEntity> dto=new GenericDTO<>();
        NeedyStudentEntity needyStudent=new NeedyStudentEntity();

        if (!needyStudentModel.getFirstName().isEmpty())
            needyStudent.setName(needyStudentModel.getFirstName());
        if (!needyStudentModel.getLastName().isEmpty())
            needyStudent.setFamily(needyStudentModel.getLastName());
        if (!needyStudentModel.getPhoneNumber().isEmpty())
            needyStudent.setPhoneNumber(needyStudentModel.getPhoneNumber());
        if (!needyStudentModel.getDescription().isEmpty())
            needyStudent.setDescription(needyStudentModel.getDescription());
        if (!needyStudentModel.getStudentNumber().isEmpty()){
            needyStudent.setStudentId(needyStudentModel.getStudentNumber());
        }
        dto.setFilled(needyStudent);

        if (needyStudentModel.getPhoneNumber().isEmpty() || needyStudentModel.getFirstName().isEmpty()
                || needyStudentModel.getLastName().isEmpty()){
            dto.setState(0); // incomplete input
        }
        else{
            dto.setState(1); // ok input
            boolean insert=needyStudentService.insertNeedyStudent(needyStudent);
            if (!insert)
                dto.setState(-1); // invalid inputs / id is repetitive
        }
        model.addAttribute("dto",dto);
        return "needyStudents";
    }

}
