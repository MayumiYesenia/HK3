package com.example.demo.entidades;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private int credits;
    private String code;
    private String HRGroup;
    private String cycle;
    private String VRGroup;
    
    @OneToMany
    private CourseType courseType;


    public Course() {
    }

    public Course(String name, int credits, String code, String HRGroup, String cycle, CourseType courseType, String VRGroup) {
        this.name = name;
        this.credits = credits;
        this.code = code;
        this.HRGroup = HRGroup;
        this.cycle = cycle;
        this.courseType = courseType;
        this.VRGroup = VRGroup;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHRGroup() {
        return HRGroup;
    }

    public void setHRGroup(String HRGroup) {
        this.HRGroup = HRGroup;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getVRGroup() {
        return VRGroup;
    }

    public void setVRGroup(String vRGroup) {
        VRGroup = vRGroup;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }


    public void setHours(String startTime, String endTime, Integer duration) {
    }
}