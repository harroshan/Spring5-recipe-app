package com.harroshan.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
        String temp = "Hello Index Page";
        model.addAttribute("temp", temp);
        return "index";
    }
}
