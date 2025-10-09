package ej2;

import java.util.ArrayList;
import java.util.Scanner;


public class Biblioteca {
	private String nombre;
	private ArrayList<Libro> libros = new ArrayList<>();

	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
	}

	public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
		Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
		libros.add(libro);
	}

	public void listarLibros() {
		for (Libro libro : libros) {
			System.out.println(libros.indexOf(libro) + 1 + ") " + libro);
		}
	}

	public void buscarLibroporIsbn(String isbn) {
		for (Libro l : libros) {
			if (l.getIsbn().equals(isbn)) {
				System.out.println(l);
			}
		}

	}

	public void eliminarLibro(String isbn) {
		for (int i=0; i<libros.size();i++) {
			if (libros.get(i).getIsbn().equals(isbn)) {
				libros.remove(i);
			}
		}
	}

	public void obtenerCantLibros() {
		System.out.println("hay " + libros.size() + " libros en la biblioteca");
	}

	public void filtrarLibrosPorAnio(int anio) {
		System.out.println("Libros publicados en " + anio + ":");
		for (Libro l : libros) {
			if (l.getAnioPublicacion() == anio) {
				l.mostrarInfo();
			}
		}
	}

	public void mostrarAutoresDisponibles() {
		ArrayList<Autor> autores = new ArrayList<>();
		for (Libro l : libros) {
			if (!autores.contains(l.getAutor())) {
				autores.add(l.getAutor());
			}
		}
		for (Autor a : autores) {
			System.out.println(a);
		}
	}

}
