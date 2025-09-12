package trabajopractico3;

public class Empleado {

    private int id;
    private String nombre, puesto;
    private double salario;
    private static int totalEmpleados;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = 100;
        this.salario = 10000;
        totalEmpleados++;
    }

    public void actualizarSalario(int porcentaje) {
       this.salario += (this.salario * (porcentaje / 100.0));
       
    }

    public void actualizarSalario(double aumento) {
        this.salario += aumento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }

    public static void mostrarEmpleados(){
        System.out.println("hay "+totalEmpleados+" empleados");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
