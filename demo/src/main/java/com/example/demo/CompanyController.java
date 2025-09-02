package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CompanyController {

    @GetMapping("/company")
    public String company(@RequestParam(name = "name", required = false) String name, Model model) {
        if (name != null && !name.isBlank()) {
            model.addAttribute("name", name);
        }
        return "company"; // Renders src/main/resources/templates/company.html
    }
}
