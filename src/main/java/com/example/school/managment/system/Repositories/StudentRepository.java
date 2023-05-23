package com.example.school.managment.system.Repositories;

import com.example.school.managment.system.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
