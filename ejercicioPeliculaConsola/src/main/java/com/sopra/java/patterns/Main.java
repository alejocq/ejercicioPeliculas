package com.sopra.java.patterns;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sopra.java.model.entities.Pelicula;
import com.sopra.java.patterns.model.business.GestorPeliculas;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ejercicioPelicula.xml");
		GestorPeliculas gestionPeliculas = context.getBean("gestorPeliculas", GestorPeliculas.class);
		List<Pelicula> listaPeliculas = context.getBean("miLista", List.class);
		List<Pelicula> listaPeliculasAModificar = context.getBean("miLista", List.class);
		List<Pelicula> listaPeliculasABorrar = context.getBean("miLista", List.class);
		for(int i = 0; i < 10; i++) {
			Pelicula pelicula = context.getBean("pelicula", Pelicula.class);
			pelicula.setIdentificador(Integer.toString(i));
			pelicula.setTitulo("La casa del terror");
			pelicula.setDirector("Tarantino");
			pelicula.setSinopsis("Esta es la descripción de la pelicula");
			listaPeliculas.add(pelicula);
		}
		for(int i = 0; i < 2; i++) {
			Pelicula pelicula = context.getBean("pelicula", Pelicula.class);
			pelicula.setIdentificador(Integer.toString(i));
			pelicula.setTitulo("Toy Story");
			pelicula.setDirector("Pixar");
			pelicula.setSinopsis("Esta es la descripción de la pelicula");
			listaPeliculasAModificar.add(pelicula);
		}
		for(int i = 8; i < 10; i++) {
			Pelicula pelicula = context.getBean("pelicula", Pelicula.class);
			pelicula.setIdentificador(Integer.toString(i));
			pelicula.setTitulo("Toy Story");
			pelicula.setDirector("Pixar");
			pelicula.setSinopsis("Esta es la descripción de la pelicula");
			listaPeliculasABorrar.add(pelicula);
		}
		
		gestionPeliculas.altaPeliculas(listaPeliculas);
		System.out.println(gestionPeliculas.listaPeliculas());
		gestionPeliculas.updatePeliculas(listaPeliculasAModificar);
		System.out.println(gestionPeliculas.listaPeliculas());
		gestionPeliculas.deletePeliculas(listaPeliculasABorrar);
		System.out.println(gestionPeliculas.listaPeliculas());
		
	}
}
