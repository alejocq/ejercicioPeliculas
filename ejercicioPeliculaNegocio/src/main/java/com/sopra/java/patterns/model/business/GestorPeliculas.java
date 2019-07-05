package com.sopra.java.patterns.model.business;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sopra.java.model.entities.Pelicula;
import com.sopra.java.patterns.model.dao.IPeliculaDao;
import com.sopra.java.patterns.model.dao.PeliculaDaoImplement;

public class GestorPeliculas {
	ApplicationContext context = new ClassPathXmlApplicationContext("ejercicioPelicula.xml");
	private IPeliculaDao peliculaDao = context.getBean("peliculaDaoImplement", PeliculaDaoImplement.class);
	
	
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
