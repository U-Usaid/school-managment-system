package com.example.school.managment.system.Service;

import com.example.school.managment.system.Model.Student;
import com.example.school.managment.system.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public Student editStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudent(Integer id){
        studentRepository.deleteById(id);
    }
}
