package com.sopra.java.model.entities;

public class Pelicula {
	private String identificador;
	private String titulo;
	private String director;
	private String sinopsis;
	
	
	@Override
	public String toString() {
		return "Pelicula [identificador=" + identificador + ", titulo=" + titulo + ", director=" + director
				+ ", sinopsis=" + sinopsis + "]\n";
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	
	
}
