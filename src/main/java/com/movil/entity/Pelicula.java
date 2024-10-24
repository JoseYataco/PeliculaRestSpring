package com.movil.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pelicula")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPelicula;

	@Column(name = "nombres", nullable = false, length = 200)
	private String nombres;

	@Column(name = "genero", nullable = false, length = 200)
	private String apellidos;

	@Column(name = "año", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date año;

	@Column(name = "calificacion", nullable = false)
	private int calificacion;
}