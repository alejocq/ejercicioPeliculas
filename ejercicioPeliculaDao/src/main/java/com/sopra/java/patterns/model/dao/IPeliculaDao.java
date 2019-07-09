package com.sopra.java.patterns.model.dao;

import java.util.Collection;
import java.util.Map;

import com.sopra.java.model.entities.Pelicula;

public interface IPeliculaDao {
	Map<String, Pelicula> getAlmacenDePeliculas();
	void setAlmacenDePeliculas(Map<String, Pelicula> almacenDePeliculas);
	void create(Pelicula pelicula);
	Pelicula update(Pelicula pelicula);
	void delete(Pelicula pelicula);
	Collection<Pelicula> read();
	Pelicula readById(String id);
}
