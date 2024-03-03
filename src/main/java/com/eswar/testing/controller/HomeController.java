package com.eswar.testing.controller;

import com.eswar.testing.db.StudentDB;
import com.eswar.testing.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping
    public String home(Model model){
        StudentDB db = StudentDB.getInstance();
        model.addAttribute("students",db.getStudentList());
        return "index";
    }
}
