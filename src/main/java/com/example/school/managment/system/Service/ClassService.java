package com.example.school.managment.system.Service;

import com.example.school.managment.system.Model.ClassRoom;
import com.example.school.managment.system.Repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    @Autowired
    ClassRepository classRepository;

    public List<ClassRoom> getClasses(){
        return classRepository.findAll();
    }
    public ClassRoom addClass(ClassRoom clas){
        return classRepository.save(clas);
    }

    public ClassRoom editClass(ClassRoom clas){
        return classRepository.save(clas);
    }


    public void deleteClass(Integer id){
        classRepository.deleteById(id);
    }
}
