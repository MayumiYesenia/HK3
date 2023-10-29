package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.CourseAssessmentDetails;

public interface CourseAssessmentDetailsRepository extends JpaRepository<CourseAssessmentDetails, Long>{}