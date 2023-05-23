package com.example.school.managment.system.Repositories;

import com.example.school.managment.system.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
