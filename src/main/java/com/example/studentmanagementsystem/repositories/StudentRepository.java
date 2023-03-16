package com.example.studentmanagementsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentmanagementsystem.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
