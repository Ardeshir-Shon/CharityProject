package com.sbu.controller;

import com.sbu.controller.model.RecommendationModel;
import com.sbu.dao.model.IntroductionEntity;
import com.sbu.service.IntroductionService;
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
@RequestMapping(value = "/recommendation")
public class RecommendationController {

    @Autowired
    IntroductionService introductionService;

    @RequestMapping(method = RequestMethod.GET)
    public String recommendationPage(Model model){
        return "recommendation";
    }

    @RequestMapping(value = "/main", method = RequestMethod.POST)
    public String recommendationSubmit(Model model , @ModelAttribute("recommendationModel")RecommendationModel recommendationModel){

        IntroductionEntity recommendationEntity=new IntroductionEntity();

        return "";
    }

}
