package com.example.baitap1.controller;

import com.example.baitap1.model.EmailConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class EmailController {
    @GetMapping("/config")
    public String showform(Model model) {
        EmailConfig emailConfig = new EmailConfig("English", 25, true, "Thỏ\nKing, Asgard");
        model.addAttribute("emailConfig", emailConfig);
        List<String> languages = Arrays.asList("English", "Vietnamese", "Japanese", "chinese");
        model.addAttribute("languages", languages);
        List<Integer> pagesSize = Arrays.asList(5, 10, 15, 25, 50, 100);
        model.addAttribute("pagesSize", pagesSize);
        return "/form";
    }
    @PostMapping("/config")
    public String updateConfig(@ModelAttribute("emailConfig") EmailConfig emailConfig, Model model) {
        model.addAttribute("emailConfig", emailConfig);
        return "/result";
    }
}


