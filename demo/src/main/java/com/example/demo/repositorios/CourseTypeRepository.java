package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entidades.CourseType;

public interface CourseTypeRepository extends JpaRepository<CourseType, Long>{}
