package com.eswar.testing.service;

import com.eswar.testing.db.StudentDB;
import com.eswar.testing.entity.Student;
import com.eswar.testing.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    StudentRepo studentRepo;
    private StudentDB db = StudentDB.getInstance();

    public void addStudent(Student s){
        studentRepo.save(s);
        db.addStudent(s);
    }

    public List<Student> getAllStudents(){
        //System.out.println(studentRepo.findAll());
        return studentRepo.findAll();
        //return db.getStudentList();
    }
}
