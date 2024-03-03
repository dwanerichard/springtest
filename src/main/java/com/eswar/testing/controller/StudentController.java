package com.eswar.testing.controller;

import com.eswar.testing.entity.Student;
import com.eswar.testing.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService = new StudentService();
    @GetMapping
    public String home(Model model){
        model.addAttribute("s",new Student());
        return "student";
    }

    @PostMapping("add")
    public String addStudent(@ModelAttribute Student s){
        studentService.addStudent(s);
        return "redirect:/";
    }


}
