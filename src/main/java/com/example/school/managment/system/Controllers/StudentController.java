package com.example.school.managment.system.Controllers;

import com.example.school.managment.system.Model.Student;
import com.example.school.managment.system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getStudents();
    }

    @PostMapping("addStudent")
    public Student createStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }


}
