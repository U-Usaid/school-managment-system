package com.example.school.managment.system.Controllers;

import com.example.school.managment.system.Model.Course;
import com.example.school.managment.system.Repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public List<Course> getAllCourse(){
        return courseRepository.findAll();
    }
}
