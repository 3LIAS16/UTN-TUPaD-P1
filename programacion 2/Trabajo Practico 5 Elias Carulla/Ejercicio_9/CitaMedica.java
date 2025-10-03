
package Ejercicio_9;


public class CitaMedica {
    private String fecha;
    private int hora;
    private Paciente paciente;
    private Profecional profecional;

    public CitaMedica(String fecha, int hora, Paciente paciente, Profecional profecional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profecional = profecional;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setProfecional(Profecional profecional) {
        this.profecional = profecional;
    }
    
    
}
