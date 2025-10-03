package ejercicio_3;

public class Libro {
	private String titulo, isbn;
	private Autor autor;
	private Editorial editorial;

	public Libro(String titulo, String isbn, Editorial editorial) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.editorial = editorial;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}
