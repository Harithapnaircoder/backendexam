package com.practice.demo.controller;

import com.practice.demo.model.Course;
import com.practice.demo.repository.Allcourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses") // Corrected typo in the mapping path
public class AllCourse {

    @Autowired
    private Allcourse allcourse;

    @GetMapping("/courseadd")
    public List<Course> getAllCourses() { // Renamed method from getAllEmployees to getAllCourses
        return allcourse.findAll(); // Corrected the method call to findAll()
    }
}
