package com.eswar.testing.service;

import com.eswar.testing.db.StudentDB;
import com.eswar.testing.entity.Student;

import java.util.List;

public class StudentService {
    private StudentDB db = null;
    public StudentService(){
        db = StudentDB.getInstance();
    }
    public void addStudent(Student s){
        db.addStudent(s);
    }

    public List<Student> getAllStudents(){
        return db.getStudentList();
    }
}
