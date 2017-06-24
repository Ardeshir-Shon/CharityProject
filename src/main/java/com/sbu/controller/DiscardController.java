package com.sbu.controller;

import com.sbu.controller.DTO.GenericDTO;
import com.sbu.controller.model.DiscardModel;
import com.sbu.dao.model.HelperEntity;
import com.sbu.service.DiscardService;
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
@RequestMapping(value = "/discard")
public class DiscardController {

    @Autowired
    DiscardService discardService;

    @RequestMapping(method = RequestMethod.GET)
    public String discardPage(){
        return "discard";
    }

    @RequestMapping(value = "/main" , method = RequestMethod.POST)
    public String discardSubmit(Model model, @ModelAttribute("discardModel")DiscardModel discardModel){

        GenericDTO<DiscardModel> dto=new GenericDTO<>();
        HelperEntity helperEntity=new HelperEntity();
        dto.setFilled(discardModel);
        if (discardModel.getPhoneNumber().isEmpty() || discardModel.getPassword().isEmpty()){
            dto.setState(0);// incomplete inputs
        }
        else {
            helperEntity.setPhoneNumber(discardModel.getPhoneNumber());
            helperEntity.setPassword(discardModel.getPassword());
            boolean discard;
            if (discardService.validation(discardModel.getPhoneNumber(),discardModel.getPassword())){
                discard=discardService.dicardHelper(helperEntity);
                if (discard)
                    dto.setState(1);
                else
                    dto.setState(-1);
            }
            else {
                dto.setState(-1); // wrong password or phone number
            }
        }
        model.addAttribute("dto",dto);
        return "discard";
    }

}
