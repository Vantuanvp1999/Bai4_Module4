package com.example.thuchanh2.controller;

import com.example.thuchanh2.model.Login;
import com.example.thuchanh2.model.User;
import com.example.thuchanh2.model.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("login", new Login());
        return mav;
    }
    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login) {
        User user = UserDAO.checkLogin(login);
        ModelAndView modelAndView;
        if (user == null) {
            modelAndView = new ModelAndView("error");
        }else {
            modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", user);
        }
        return modelAndView;
    }
}
