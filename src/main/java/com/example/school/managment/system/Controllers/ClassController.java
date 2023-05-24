package com.example.school.managment.system.Controllers;

import com.example.school.managment.system.Model.Class;
import com.example.school.managment.system.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addClass")
    public Class createClass(@RequestBody Class clas){
        return classService.addClass(clas);
    }










}
