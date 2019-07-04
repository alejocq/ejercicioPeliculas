package com.sopra.java.patterns.model.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.sopra.java.model.entities.Pelicula;

public class PeliculaDaoImplement implements IPeliculaDao {
	
	private Map<String, Pelicula> almacenDePeliculas = new HashMap<String, Pelicula>();
	
	@Override
	public void create(Pelicula pelicula) {
		almacenDePeliculas.putIfAbsent(pelicula.getIdentificador(), pelicula);
		
	}

	@Override
	public Pelicula update(Pelicula pelicula) {
		almacenDePeliculas.replace(pelicula.getIdentificador(), pelicula);
		return pelicula;
	}

	@Override
	public void delete(Pelicula pelicula) {
		almacenDePeliculas.remove(pelicula.getIdentificador());
		
	}

	@Override
	public Collection<Pelicula> read() {		
		return almacenDePeliculas.values();
	}

	@Override
	public Pelicula readById(String id) {		
		return almacenDePeliculas.get(id);
	}

}
