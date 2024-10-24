package com.movil.service;

import java.util.List;


import com.movil.entity.Pelicula;

public interface PeliculaService {

	//metodos para el crud
	public abstract List<Pelicula> findAll();
	public abstract Pelicula findById(int idPelicula);
	public abstract Pelicula save(Pelicula pelicula);
	public abstract void delete(int idPelicula);

	
	
}