package ejercicio_8;

public class Documento {
	private String titulo, contenido;
	private FirmaDigital firmaDigital;

	public Documento(String titulo, String contenido, Usuario usuario, String codigoHash, String fecha) {
		this.titulo = titulo;
		this.contenido = contenido;
		this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
	}

}
