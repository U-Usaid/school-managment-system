package com.example.school.managment.system.Service;

import com.example.school.managment.system.Model.ClassRoom;
import com.example.school.managment.system.Repositories.ClassRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomService {

    @Autowired
    ClassRoomRepository classRoomRepository;

    public List<ClassRoom> getClasses(){
        return classRoomRepository.findAll();
    }
    public ClassRoom addClass(ClassRoom clas){
        return classRoomRepository.save(clas);
    }

    public ClassRoom editClass(ClassRoom clas){
        return classRoomRepository.save(clas);
    }
    public void deleteClassroom(Integer id){

        classRoomRepository.deleteById(id);
    }
}
