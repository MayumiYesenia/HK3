package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{}