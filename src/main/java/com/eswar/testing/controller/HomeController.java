package com.eswar.testing.controller;

import com.eswar.testing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @Autowired
    StudentService studentService;
    @GetMapping
    public String home(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "index";
    }
}
