package com.example.school.managment.system.Controllers;

import com.example.school.managment.system.Model.ClassRoom;
import com.example.school.managment.system.Service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/class")
public class ClassRoomController {
    @Autowired
    ClassRoomService classRoomService;

    @GetMapping("/getAllClass")
    public List<ClassRoom> getAllClasses(){
        return classRoomService.getClasses();
    }

    @PostMapping("/addClass")
    public ClassRoom createClass(@RequestBody ClassRoom clas){
        return classRoomService.addClass(clas);
    }

    @PutMapping
    public String editClassRoom(@RequestBody ClassRoom clas){
        ClassRoom editClassRoom = classRoomService.addClass(clas);
        return "editing Class room id"+clas.getId();
    }


    @DeleteMapping("/delete/{id}")
    public String deleteClass(@PathVariable Integer id) {
        classRoomService.deleteClassroom(id);
        return "classRoom id " + id + " deleted";
    }










}
