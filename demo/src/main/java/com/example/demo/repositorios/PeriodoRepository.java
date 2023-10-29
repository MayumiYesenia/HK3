package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.Professor;

public interface PeriodoRepository extends JpaRepository<Periodo, Long>{}
