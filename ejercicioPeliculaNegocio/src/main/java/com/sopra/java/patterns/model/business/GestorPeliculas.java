package com.sopra.java.patterns.model.business;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sopra.java.model.entities.Pelicula;
import com.sopra.java.patterns.model.dao.IPeliculaDao;

public class GestorPeliculas {
	
	private IPeliculaDao peliculaDao;
	
	
	public IPeliculaDao getPeliculaDao() {
		return peliculaDao;
	}
	public void setPeliculaDao(IPeliculaDao peliculaDao) {
		this.peliculaDao = peliculaDao;
	}
	public void altaPeliculas(List<Pelicula> pelicula) {		
		for(Pelicula listaPelicula : pelicula) {
			peliculaDao.create(listaPelicula);
		}
		
	}
	public Set<Pelicula> listaPeliculas(){			
		return new HashSet<Pelicula>(peliculaDao.read());
	}
	public void updatePeliculas(List<Pelicula> pelicula) {
		for(Pelicula listaPelicula : pelicula) {
			peliculaDao.update(listaPelicula);
		}
	}
	public void deletePeliculas(List<Pelicula> pelicula) {
		for(Pelicula listaPelicula : pelicula) {
			peliculaDao.delete(listaPelicula);
		}
	}
}
