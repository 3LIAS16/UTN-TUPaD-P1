package ejercicio3;

public class EmpleadoPlanta extends Empleado {
	private final double MULTIPLICADOR_SUELDO_EMPLEADO_PLANTA=1.6;

	public EmpleadoPlanta(String nombre, int sueldoBase) {
		super(nombre, sueldoBase);
	}

	@Override
	public double calcularSueldo() {
		return sueldoBase*MULTIPLICADOR_SUELDO_EMPLEADO_PLANTA;
	}

}
