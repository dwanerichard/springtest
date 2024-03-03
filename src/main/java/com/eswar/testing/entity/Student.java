package com.eswar.testing.entity;

public class Student {
    public int id;
    public String name;
    public String mail;

    public Student(){}

    public Student(int id,String name,String mail){
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMail(String mail){
        this.mail = mail;
    }
}
