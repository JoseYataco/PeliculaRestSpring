package com.movil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movil.entity.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Integer>{

	
}