package com.example.school.managment.system.Controllers;

import com.example.school.managment.system.Model.Teacher;
import com.example.school.managment.system.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping
    public List<Teacher> getAllTeachers(){
        return teacherService.getTeachers();
    }

    @PostMapping("/addTeacher")
    public Teacher createTeacher(@RequestBody Teacher teacher){
        return teacherService.addTeacher(teacher);
    }

    @PutMapping
    public String editTeacher(@RequestBody Teacher teacher){
        Teacher editTeacher = teacherService.addTeacher(teacher);
        return "editing teacher id " + teacher.getId();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTeacher(@PathVariable Integer id){
        return "Teacher id " + id + "deleted";
    }
}
