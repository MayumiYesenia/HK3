package com.example.demo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CourseAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Course course;

    @ManyToOne
    private Periodo periodo;
    
    private String title;
    private String tipoNota;
    private Integer numNota;
    private String nomenclatura;

    public CourseAssessment() {
    }

    public CourseAssessment(Course course, Periodo periodo, String title, String tipoNota, Integer numNota, String nomenclatura) {
        this.course = course;
        this.periodo = periodo;
        this.title = title;
        this.tipoNota = tipoNota;
        this.numNota = numNota;
        this.nomenclatura = nomenclatura;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTipoNota() {
        return tipoNota;
    }

    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
    }

    public Integer getNumNota() {
        return numNota;
    }

    public void setNumNota(Integer numNota) {
        this.numNota = numNota;
    }

    public String getNomenclatura() {
        return nomenclatura;
    }

    public void setNomenclatura(String nomenclatura) {
        this.nomenclatura = nomenclatura;
    }
}
