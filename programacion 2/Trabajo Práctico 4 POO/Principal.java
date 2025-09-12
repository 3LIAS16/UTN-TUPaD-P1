
package trabajopractico3;


public class Principal {

    
    public static void main(String[] args) {
       
        Empleado emp1 = new Empleado(12, "pepe", "tecnico", 24499);
        Empleado emp2 = new Empleado(234, "niko", "limpiador de baños", 500);
        Empleado emp3 = new Empleado("elias", "CEO");
        
        
        emp2.actualizarSalario(10);
        emp1.actualizarSalario(10000.0);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        Empleado.mostrarEmpleados();
    }
    
}
