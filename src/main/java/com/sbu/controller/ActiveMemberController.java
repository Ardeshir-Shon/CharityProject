package com.sbu.controller;

import com.sbu.controller.DTO.ActiveMemberDTO;
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
        ActiveMemberDTO dto = new ActiveMemberDTO();

        activeMember.setName(activeMemberModel.getFirstName());
        activeMember.setFamily(activeMemberModel.getLastName());
        activeMember.setEmail(activeMemberModel.getMail());
        activeMember.setPhone_number(activeMemberModel.getPhoneNumber());
        activeMember.setDescription(activeMemberModel.getDescription());
        if (activeMemberModel.getStudent()){
            activeMember.setStudent_id(activeMemberModel.getStudentNumber());
        }
        dto.setFilled(activeMember);

        if (activeMemberModel.getPhoneNumber()==null || activeMemberModel.getFirstName()==null
                || activeMemberModel.getLastName()==null){
            dto.setState(0); // wrong input
        }
        else{
            dto.setState(1); // ok input
            if (activeMemberModel.getStudent() && activeMemberModel.getStudentNumber()==null ){
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
