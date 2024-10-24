package com.movil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movil.entity.Pelicula;
import com.movil.repository.PeliculaRepository;

@Service
public class PeliculaServiceImpl implements PeliculaService{
	
	@Autowired
	private PeliculaRepository peliculaRepository;

	@Override
	public List<Pelicula> findAll() {
		return peliculaRepository.findAll();
	}
	
	@Override
	public Pelicula findById(int idPelicula) {
		return peliculaRepository.findById(idPelicula).orElse(null);
	}
	
	@Override
	public Pelicula save(Pelicula pelicula) {
		return peliculaRepository.save(pelicula);
	}
	
	@Override
	public void delete(int idPelicula) {
		peliculaRepository.deleteById(idPelicula);
	}
	

}