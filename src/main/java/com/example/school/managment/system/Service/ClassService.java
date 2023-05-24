package com.example.school.managment.system.Service;

import com.example.school.managment.system.Model.Class;
import com.example.school.managment.system.Repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    @Autowired
    ClassRepository classRepository;

    public List<Class> getClasses(){
        return classRepository.findAll();
    }
    public Class addClass(Class clas){
        return classRepository.save(clas);
    }

    public Class editClass(Class clas){
        return classRepository.save(clas);
    }


    public void deleteClass(Integer id){
        classRepository.deleteById(id);
    }
}
