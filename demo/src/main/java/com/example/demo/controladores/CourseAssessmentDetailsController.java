package com.example.demo.controladores;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course_assessment_details")
public class CourseAssessmentDetailsController {

    @Autowired
    private CourseAssessmentDetailsService courseAssessmentDetailsService;

    @GetMapping
    public ResponseEntity<List<CourseAssessmentDetails>> getAllCourseAssessmentDetails() {
        List<CourseAssessmentDetails> courseAssessmentDetailsList = courseAssessmentDetailsService.findAll();
        return ResponseEntity.ok(courseAssessmentDetailsList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseAssessmentDetails> getCourseAssessmentDetailsById(@PathVariable Long id) {
        Optional<CourseAssessmentDetails> courseAssessmentDetails = courseAssessmentDetailsService.findById(id);
        return courseAssessmentDetails.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CourseAssessmentDetails> createCourseAssessmentDetails(@RequestBody CourseAssessmentDetails courseAssessmentDetails) {
        CourseAssessmentDetails createdDetails = courseAssessmentDetailsService.save(courseAssessmentDetails);
        return ResponseEntity.status(201).body(createdDetails);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CourseAssessmentDetails> updateCourseAssessmentDetails(@PathVariable Long id, @RequestBody CourseAssessmentDetails courseAssessmentDetails) {
        if (!courseAssessmentDetailsService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        courseAssessmentDetails.setId(id);
        CourseAssessmentDetails updatedDetails = courseAssessmentDetailsService.save(courseAssessmentDetails);
        return ResponseEntity.ok(updatedDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourseAssessmentDetails(@PathVariable Long id) {
        if (!courseAssessmentDetailsService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        courseAssessmentDetailsService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
