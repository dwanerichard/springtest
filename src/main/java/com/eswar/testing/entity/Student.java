package com.eswar.testing.entity;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "id_generation")
    @SequenceGenerator(name = "id_generation", sequenceName = "id_generation", allocationSize = 1)
    private Integer id;
    public String name;
    public String mail;

    public Student(){}

    public Student(int id,String name,String mail){
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }



    public void setName(String name){
        this.name = name;
    }

    public void setMail(String mail){
        this.mail = mail;
    }
}
