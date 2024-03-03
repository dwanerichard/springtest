package com.eswar.testing.db;

import com.eswar.testing.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDB {
    private List<Student> studentList = new ArrayList<>();
    private static StudentDB db = null;

    private StudentDB(){
    }

    public static StudentDB getInstance(){
        if(db==null){
            db = new StudentDB();
        }

        return db;
    }

    public void addStudent(Student s){
        studentList.add(s);
    }
    public List<Student> getStudentList(){
        return this.studentList;
    }
}
