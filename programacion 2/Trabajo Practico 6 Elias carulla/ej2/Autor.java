package ej2;

public class Autor {
	private static int count=0;
	private String id, nombre, nacionalidad;

	public Autor( String nombre, String nacionalidad) {
		this.id = String.valueOf(count);
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		count++;
	}
	
	
	

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}




	public void mostrarInfo() {
		System.out.println("Autor [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]");
	}

}
