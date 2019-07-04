package com.sopra.java.patterns;

import java.util.ArrayList;
import java.util.List;

import com.sopra.java.model.entities.Pelicula;
import com.sopra.java.patterns.model.business.GestorPeliculas;

public class Main {
	public static void main(String[] args) {
		GestorPeliculas gestionPeliculas = new GestorPeliculas();
		List<Pelicula> listaPeliculas = new ArrayList<>();
		List<Pelicula> listaPeliculasAModificar = new ArrayList<>();
		List<Pelicula> listaPeliculasABorrar = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			Pelicula pelicula = new Pelicula();
			pelicula.setIdentificador(Integer.toString(i));
			pelicula.setTitulo("La casa del terror");
			pelicula.setDirector("Tarantino");
			pelicula.setSinopsis("Esta es la descripción de la pelicula");
			listaPeliculas.add(pelicula);
		}
		for(int i = 0; i < 2; i++) {
			Pelicula pelicula = new Pelicula();
			pelicula.setIdentificador(Integer.toString(i));
			pelicula.setTitulo("Toy Story");
			pelicula.setDirector("Pixar");
			pelicula.setSinopsis("Esta es la descripción de la pelicula");
			listaPeliculasAModificar.add(pelicula);
		}
		for(int i = 8; i < 10; i++) {
			Pelicula pelicula = new Pelicula();
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
