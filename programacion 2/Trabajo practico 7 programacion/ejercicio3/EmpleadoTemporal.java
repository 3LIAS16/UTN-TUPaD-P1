package ejercicio3;

public class EmpleadoTemporal extends Empleado{
	private final double MULTIPLICADOR_SUELDO_EMPLEADO_TEMPORAL=2.4;
	
	public EmpleadoTemporal( String nombre,int sueldoBase) {
		super(nombre, sueldoBase);
	}

	@Override
	public double calcularSueldo() {
		return sueldoBase*MULTIPLICADOR_SUELDO_EMPLEADO_TEMPORAL;
	}

}
