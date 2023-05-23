package com.example.school.managment.system.Service;

import com.example.school.managment.system.Model.Course;
import com.example.school.managment.system.Repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public List<Course> getCourses(){
        return courseRepository.findAll();
    }
}
