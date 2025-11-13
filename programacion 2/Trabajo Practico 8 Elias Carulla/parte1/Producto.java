package parte1;

public class Producto implements Pagable {
	
	private double precio;
	private String nombre;

	public Producto(double precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public double CalcularTotal() {
		return precio;
	}
}
