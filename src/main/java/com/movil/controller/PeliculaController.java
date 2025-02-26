package com.movil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movil.entity.Pelicula;

import com.movil.service.PeliculaService;

@RestController
@RequestMapping("/url/pelicula")
public class PeliculaController {

	@Autowired
	private PeliculaService peliculaService;
	
	
	//metodos de listar
	@GetMapping("/listar")
	public List<Pelicula> listar() {
		return peliculaService.findAll();
	}
	
	@PostMapping("/registrar")
	public Pelicula registrar(@RequestBody Pelicula pelicula) {
		return peliculaService.save(pelicula);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") int idpelicula) {
		peliculaService.delete(idpelicula);
	}
	
}