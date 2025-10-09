
package ej3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        if (profesor != null && profesor != p) {
            profesor.eliminarCurso(this);
        }
        if (p != null) {
            profesor = p;
            if (!p.getCursos().contains(this)) {
                p.agregarCurso(this);
            }
        } else {
            profesor = null;
        }
    }

    public void mostrarInfo() {
        String profNombre = (profesor != null) ? profesor.getNombre() : "Sin Profesor";
        System.out.println("Curso " + codigo + ": " + nombre + " - Profesor: " + profNombre);
    }
}
