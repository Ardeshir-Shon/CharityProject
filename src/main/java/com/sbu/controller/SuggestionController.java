package com.sbu.controller;

import com.sbu.controller.DTO.GenericDTO;
import com.sbu.controller.model.SuggestionModel;
import com.sbu.dao.model.SuggestionEntity;
import com.sbu.service.SuggestionService;
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
@RequestMapping(value = "/suggestion")
public class SuggestionController {

    @Autowired
    SuggestionService suggestionService;

    @RequestMapping(method = RequestMethod.GET)
    public String suggestionPage(){
        return "suggestion";
    }

    @RequestMapping(value = "/main" , method =RequestMethod.POST )
    public String suggestionSubmit(Model model, @ModelAttribute("suggestionModel")SuggestionModel suggestionModel){

        GenericDTO<SuggestionEntity> dto=new GenericDTO<>();
        SuggestionEntity suggestionEntity=new SuggestionEntity();
        Integer required=0;
        boolean insert;

        if (!suggestionModel.getFirstName().isEmpty())
        {
            suggestionEntity.setName(suggestionModel.getFirstName());
            required++;
        }
        if (!suggestionModel.getBody().isEmpty())
        {
            suggestionEntity.setText(suggestionModel.getBody());
            required++;
        }
        //title
        if (!suggestionModel.getTitle().isEmpty())
        {
            suggestionEntity.setSubject(suggestionModel.getTitle());
            required++;
        }

        if (required!=3)//incomplete required inputs.
        {
            dto.setState(0);
        }
        else {
            dto.setState(1);
            if (suggestionModel.getTendency()){
                if (!suggestionModel.getPhoneNumber().isEmpty() || !suggestionModel.getEmail().isEmpty()){// ok
                    if (!suggestionModel.getPhoneNumber().isEmpty())
                        suggestionEntity.setPhoneNumber(suggestionModel.getPhoneNumber());
                    if (!suggestionModel.getEmail().isEmpty())
                        suggestionEntity.setEmail(suggestionModel.getEmail());
                }
                else {
                    dto.setState(2); // tendency but not more contact
                    dto.setFilled(suggestionEntity);
                    model.addAttribute("dto",dto);
                    return "suggestion";
                }
            }
            insert= suggestionService.insertSuggestion(suggestionEntity);
            if (!insert)
                dto.setState(-1);
        }
        dto.setFilled(suggestionEntity);
        model.addAttribute("dto",dto);
        return "suggestion";
    }

}
