package com.example.school.managment.system.Repositories;

import com.example.school.managment.system.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
