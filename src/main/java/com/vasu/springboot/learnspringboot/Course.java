package com.vasu.springboot.learnspringboot;

import lombok.Data;

import java.beans.ConstructorProperties;

@Data
public class Course {
    private int id;
    private String course;
    private String author;

    public Course(int id, String course, String author) {
        this.id = id;
        this.course = course;
        this.author = author;
    }
}
