package com.example.school.managment.system.Service;

import com.example.school.managment.system.Model.Teacher;
import com.example.school.managment.system.Repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    public List<Teacher> getTeachers(){
        return teacherRepository.findAll();
    }

    public Teacher addTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    public Teacher editTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Integer id){
        teacherRepository.deleteById(id);
    }
}
