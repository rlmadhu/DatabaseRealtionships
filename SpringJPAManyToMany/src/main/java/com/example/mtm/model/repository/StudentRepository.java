package com.example.mtm.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mtm.model.Student;
 

public interface StudentRepository extends JpaRepository<Student, Integer>{
}