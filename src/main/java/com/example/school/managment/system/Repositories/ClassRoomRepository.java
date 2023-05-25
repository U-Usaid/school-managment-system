package com.example.school.managment.system.Repositories;

import com.example.school.managment.system.Model.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepository extends JpaRepository<ClassRoom, Integer> {

}
