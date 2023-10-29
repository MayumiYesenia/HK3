package com.example.demo.servicios;
import com.example.demo.entidades.Course;
import com.example.demo.repositorios.CourseRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseAssessmentDetailsService {

    @Autowired
    private CourseRepository lugarRepository;


    public List<Course> getAllLugares() {
        return lugarRepository.findAll();
    }

    public Course getLugarById(Long id) {
        return lugarRepository.findById(id).orElse(null);
    }

    public Course createLugar(Course lugar) {
        return lugarRepository.save(lugar);
    }
}