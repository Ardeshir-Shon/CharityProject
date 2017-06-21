//FINAL 
package com.sbu.controller;

import com.sbu.dao.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// Bind controller to URL /welcome
// initial view will be resolved to the name returned in the default GET method
@RequestMapping("/welcome")
public class WelcomeController {

    // Controller will always look for a default GET method to call first, irrespective of name
    // In this case, named welcome to ease identification
    @RequestMapping(method = RequestMethod.GET)
    // Method contains Model input to setup date object
    public String welcome(Model model) {
        Date today = new Date();
        // Add date to model so it can be display in view
        model.addAttribute("today", today);
        // Return view welcome. Via resolver the view
        // will be mapped to /WEB-INF/jsp/welcome.jsp
        return "welcome";
    }

    @RequestMapping(value = "welcome2", method = RequestMethod.GET)
    // Method contains Model input to setup date object
    public String welcome2(Model model) {
        User u = new User();
        u.setId(10);
        u.setName("ali");
        u.setUsername("akbari");
        // Add date to model so it can be display in view
        model.addAttribute("user", u);
        // Return view welcome. Via resolver the view
        // will be mapped to /WEB-INF/jsp/welcome.jsp
        return "user";
    }

    @RequestMapping(value = "welcome4", method = RequestMethod.GET)
    // Method contains Model input to setup date object
    public String welcome4(@RequestParam("id")String id,Model model) {
        User u = new User();
        u.setId(10);
        u.setName("ali");
        u.setUsername("akbari");
        // Add date to model so it can be display in view
        model.addAttribute("user", u);
        // Return view welcome. Via resolver the view
        // will be mapped to /WEB-INF/jsp/welcome.jsp
        return "user";
    }

}
