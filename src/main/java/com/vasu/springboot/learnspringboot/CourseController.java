package com.vasu.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(new Course(1,"course1","author1"),
                new Course(2,"course2","author2"),
                new Course(3,"course3","author2"),
                new Course(4,"course3","author2"),
                new Course(5,"course3","author2"),
                new Course(6,"course3","author2"),
                new Course(6,"course3","author2"),
                new Course(6,"course3","author2"));
    }
}
