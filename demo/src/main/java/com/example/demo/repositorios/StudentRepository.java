package com.example.demo.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.Student;
public interface StudentRepository extends JpaRepository<Student, Long>{}
    