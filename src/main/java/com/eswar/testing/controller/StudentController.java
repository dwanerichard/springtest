package com.eswar.testing.controller;

import com.eswar.testing.dto.StudentFormDto;
import com.eswar.testing.entity.Student;
import com.eswar.testing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public String home(Model model){
        model.addAttribute("s",new StudentFormDto());
        return "student";
    }

    @PostMapping("add")
    public String addStudent(@ModelAttribute StudentFormDto s){
        Student student = new Student();
        student.setName(s.getName());
        student.setMail(s.getMail());
        studentService.addStudent(student);
        return "redirect:/";
    }


}
