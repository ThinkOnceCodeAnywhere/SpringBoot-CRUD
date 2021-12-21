package com.example.operations.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "school")
    String school;

    public Student() {
    }

    public Student(int id, String name, String school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }
}
