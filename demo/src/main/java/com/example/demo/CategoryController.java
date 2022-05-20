package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("categories")
public class CategoryController {
    @Autowired
    private CategoryRepositry categoryRepositry;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("tittle", "Master Category");
        model.addAttribute("categories",  categoryRepositry.findAll());
        return "categories/index";
    }
}
