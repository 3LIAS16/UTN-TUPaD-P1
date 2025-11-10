package ejercicio3;

public abstract class Empleado {
	protected String dni, nombre;
	protected int sueldoBase;
	
	public Empleado(String nombre, int sueldoBase) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldoBase=sueldoBase;
	}

	public abstract double calcularSueldo();
}
