package com.example.netflix.domain;

import lombok.Data;

@Data
public class Student
{
    private String name;
    private String className;

    public Student(){}

    public Student(String name, String className) {
        super();
        this.name = name;
        this.className = className;
    }



}