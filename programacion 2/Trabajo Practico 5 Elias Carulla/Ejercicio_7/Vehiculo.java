
package Ejercicio_7;


public class Vehiculo {
    
    private String patente,modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    

    
    
    
}
