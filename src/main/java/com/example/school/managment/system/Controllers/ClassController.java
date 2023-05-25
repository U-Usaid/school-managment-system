package com.example.school.managment.system.Controllers;

import com.example.school.managment.system.Model.ClassRoom;
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
    public List<ClassRoom> getAllClasses(){
        return classService.getClasses();
    }

    @PostMapping("/addClass")
    public ClassRoom createClass(@RequestBody ClassRoom clas){
        return classService.addClass(clas);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteClass(@PathVariable int id) {
         classService.deleteClass(id);
        return "classRoom with" + id + "deleted";

    }










}
