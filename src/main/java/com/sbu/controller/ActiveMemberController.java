package com.sbu.controller;

import com.sbu.controller.DTO.GenericDTO;
import com.sbu.controller.model.ActiveMemberModel;
import com.sbu.dao.model.ActiveMemberEntity;
import com.sbu.service.ActiveMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by user on 6/22/2017.
 */
@Controller
@RequestMapping(value = "/activeMembers")
public class ActiveMemberController  {

    @Autowired
    ActiveMemberService activeMemberService;

    @RequestMapping(method = RequestMethod.GET)
    public String activeMembersPage(Model model){
        return "activeMembers";
    }

    @RequestMapping(value = "/main" , method = RequestMethod.POST)
    public String activeMemberSubmit(Model model, @ModelAttribute("activeMemberModel") ActiveMemberModel activeMemberModel) {

        ActiveMemberEntity activeMember = new ActiveMemberEntity();
        GenericDTO<ActiveMemberEntity> dto = new GenericDTO<>();

        if (!activeMemberModel.getFirstName().isEmpty())
            activeMember.setName(activeMemberModel.getFirstName());
        if (!activeMemberModel.getLastName().isEmpty())
            activeMember.setFamily(activeMemberModel.getLastName());
        if (!activeMemberModel.getMail().isEmpty())
            activeMember.setEmail(activeMemberModel.getMail());
        if (!activeMemberModel.getPhoneNumber().isEmpty())
            activeMember.setPhone_number(activeMemberModel.getPhoneNumber());
        if (!activeMemberModel.getDescription().isEmpty())
            activeMember.setDescription(activeMemberModel.getDescription());
        if (activeMemberModel.getStudent() && !activeMemberModel.getStudentNumber().isEmpty()){
            activeMember.setStudentId(activeMemberModel.getStudentNumber());
        }
        dto.setFilled(activeMember);

        if (activeMemberModel.getPhoneNumber().isEmpty() || activeMemberModel.getFirstName().isEmpty()
                || activeMemberModel.getLastName().isEmpty()){
            dto.setState(0); // incomplete input
        }
        else{
            dto.setState(1); // ok input
            if (activeMemberModel.getStudent() && activeMemberModel.getStudentNumber().isEmpty() ){
                dto.setState(2); // wrong input down
                model.addAttribute("dto",dto);
                return "activeMembers";
            }
            boolean insert=activeMemberService.insertActiveMemberEntity(activeMember);
            if (!insert)
                dto.setState(-1); // invalid inputs / id is repetitive
        }
        model.addAttribute("dto",dto);
        return "activeMembers";
    }


}
