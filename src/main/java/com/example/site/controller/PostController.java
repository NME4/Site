package com.example.site.controller;

import com.example.site.service.impl.MemPostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    private final MemPostService memPostService;

    public PostController(MemPostService memPostService) {
        this.memPostService = memPostService;
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("posts", memPostService.search());
        return "hello";
    }
}
