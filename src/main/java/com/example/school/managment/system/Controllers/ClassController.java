package com.example.school.managment.system.Controllers;

import com.example.school.managment.system.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {
    @Autowired
    ClassService classService;

    @GetMapping
    public List<Class> getAllClasses(){
        return classService.getClasses();
    }
}
