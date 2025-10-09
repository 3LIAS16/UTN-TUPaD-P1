package ej1;

public class Producto {
private static int count = 0;
private  int id=0;
private String nombre;
private double precio;
private int cantidad;
private CategoriaProducto categoria;

public Producto( String nombre, double precio, int cantidad) {
	this.id = count;
	this.nombre = nombre;
	this.precio = precio;
	this.cantidad = cantidad;
	this.categoria=CategoriaProducto.seleccionarCategoria(nombre);
	count++;
}

public void mostrarInfo() {
	System.out.println( "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad
			+ ", categoria=" + categoria + "]");
}

public String getNombre() {
	return nombre;
}

public int getCantidad() {
	return cantidad;
}


}
