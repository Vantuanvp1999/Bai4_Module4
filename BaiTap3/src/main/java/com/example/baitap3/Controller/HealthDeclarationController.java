package com.example.baitap3.Controller;

import com.example.baitap3.Model.HealthDeclaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/declaration")
public class HealthDeclarationController {
    private List<HealthDeclaration> declarations = new ArrayList<HealthDeclaration>();
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("healthDeclaration", new HealthDeclaration());
        return "/form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute HealthDeclaration healthDeclaration) {
        declarations.add(healthDeclaration);
        return "redirect:/declaration/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("declarations", declarations);
        return "/list";
    }

}
