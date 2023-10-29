package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.CourseAssessment;

public interface CourseAssessmentRepository extends JpaRepository<CourseAssessment, Long>{}