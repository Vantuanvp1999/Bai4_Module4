package com.example.baitap3.Controller;

import com.example.baitap3.Model.HealthDeclaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/declaration")
public class HealthDeclarationController {

    // Danh sách để lưu tạm thời các tờ khai
    private final List<HealthDeclaration> declarations = new ArrayList<>();

    // Hiển thị form nhập liệu
    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("healthDeclaration", new HealthDeclaration());
        return "form"; // file form.html trong /resources/templates/
    }

    // Nhận dữ liệu từ form và lưu vào danh sách
    @PostMapping("/submit")
    public String submitForm(@ModelAttribute("healthDeclaration") HealthDeclaration healthDeclaration) {
        declarations.add(healthDeclaration);
        return "redirect:/declaration/list";
    }

    // Hiển thị danh sách các tờ khai đã lưu
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("declarations", declarations);
        return "list"; // file list.html trong /resources/templates/
    }
}
