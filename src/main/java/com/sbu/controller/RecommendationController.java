package com.sbu.controller;

import com.sbu.controller.DTO.GenericDTO;
import com.sbu.controller.DTO.RecommendationDTO;
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
        GenericDTO<IntroductionEntity> dto=new GenericDTO<>();

        if (!recommendationModel.getSuccorFirstName().isEmpty())
            recommendationEntity.setRecommenderName(recommendationModel.getSuccorFirstName());

        if (!recommendationModel.getSuccorLastName().isEmpty())
            recommendationEntity.setRecommenderFamily(recommendationModel.getSuccorLastName());

        if (!recommendationModel.getSuccorPhoneNumber().isEmpty())
            recommendationEntity.setRecommenderPhoneNumber(recommendationModel.getSuccorPhoneNumber());

        if (!recommendationModel.getSuccorFirstName().isEmpty() && recommendationModel.getSuccorStudentNumber()!=null )
            recommendationEntity.setRecommenderStudentId(recommendationModel.getSuccorStudentNumber());
        //needy
        if (!recommendationModel.getNeedyFirstName().isEmpty())
            recommendationEntity.setNeedyName(recommendationModel.getNeedyFirstName());

        if (!recommendationModel.getNeedyLastName().isEmpty())
            recommendationEntity.setNeedyFamily(recommendationModel.getNeedyLastName());

        if (!recommendationModel.getNeedyStudentNumber().isEmpty())
            recommendationEntity.setNeedyStudentId(recommendationModel.getNeedyStudentNumber());

        if (!recommendationModel.getNeedyGender().isEmpty())
            recommendationEntity.setNeedyGender(recommendationModel.getNeedyGender());

        if (!recommendationModel.getNeedyEntryYear().isEmpty())
            recommendationEntity.setNeedyEnteringYear(recommendationModel.getNeedyEntryYear());

        if (!recommendationModel.getNeedyFacultyName().isEmpty())
            if (recommendationModel.getNeedyFacultyName().equals("other") && !recommendationModel.getOtherFacultyName().isEmpty())
                recommendationEntity.setNeedyCollege(recommendationModel.getOtherFacultyName());
            else
                recommendationEntity.setNeedyCollege(recommendationModel.getNeedyFacultyName());

        if (!recommendationModel.getIsDormSettler().isEmpty())
            recommendationEntity.setNeedyDormOccupy(true);

        if (!recommendationModel.getIsNotDormSettler().isEmpty())
            recommendationEntity.setNeedyDormOccupy(false);

        if (!recommendationModel.getMoreInfo().isEmpty())
            recommendationEntity.setAboutNeedyStudent(recommendationModel.getMoreInfo());

        if (!recommendationModel.getAwarenessInfo().isEmpty())
            recommendationEntity.setRecognition(recommendationModel.getAwarenessInfo());

        dto.setFilled(recommendationEntity);

        if (recommendationModel.getSuccorFirstName().isEmpty() || recommendationModel.getSuccorLastName().isEmpty()
                || recommendationModel.getSuccorPhoneNumber().isEmpty() )
            dto.setState(0); // incomplete inputs
        else{
            dto.setState(1); // ok state
            if (recommendationModel.getStudent() && recommendationModel.getSuccorStudentNumber().isEmpty()){
                dto.setState(2); // enter succor student number
                model.addAttribute("dto",dto);
                return "recommendation";
            }
            boolean insert = introductionService.insertIntroduction(recommendationEntity);
            if (!insert)
                dto.setState(-1); // invalid inputs / id is repetitive
        }

        model.addAttribute("dto",dto);
        return "recommendation";
    }

}
