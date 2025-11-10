package ejercicio3;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList <Empleado> empleados = new ArrayList<>();
		
		Empleado e1 = new EmpleadoPlanta("nico", 50000);
		Empleado e2 = new EmpleadoPlanta("jere", 100000);
		Empleado e3 = new EmpleadoTemporal("eustaquio", 50000);
		Empleado e4 = new EmpleadoTemporal("rigoberto", 100000);
		empleados.add(e1);
		empleados.add(e2);
		empleados.add(e3);
		empleados.add(e4);
		
		for(Empleado e:empleados) {
			if(e instanceof EmpleadoPlanta) {
				System.out.println("empleado de planta\nSueldo: "+e.calcularSueldo());
			}else if(e instanceof EmpleadoTemporal) {
				System.out.println("empleado temporal\nSueldo: "+e.calcularSueldo());
			}
		}
		
		
	}

}
