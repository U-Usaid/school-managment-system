package com.example.school.managment.system.Controllers;

import com.example.school.managment.system.Model.Course;
import com.example.school.managment.system.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping
    public List<Course> getAllCourse(){
        return courseService.getCourses();
    }

    @PostMapping("/addCourse")
    public Course createCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }
}
