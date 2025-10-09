package ej2;

import java.util.Scanner;


public class Libro {
	private String isbn, titulo;
	private int anioPublicacion;
	private Autor autor;

		
	
	public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
		this.autor = autor;
	}



	public String getIsbn() {
		return isbn;
	}



	public int getAnioPublicacion() {
		return anioPublicacion;
	}



	public Autor getAutor() {
		return autor;
	}



	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", autor="
				+ autor + "]";
	}



	public void mostrarInfo() {
		System.out.println("Libro [isbn=" + isbn + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion
				+ ", autor=" + autor + "]");
	}
}

