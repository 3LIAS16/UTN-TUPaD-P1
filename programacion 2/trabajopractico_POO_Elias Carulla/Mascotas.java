
package trabajopractico2;

public class Mascotas {
    
    private String nombre="zeus", especie="kangal";
    private int edad=4;
    
    void mostrarInfo(){
        System.out.println("--------------------------\n"+"Nombre: "+nombre+"\nEspecie: "+especie+"\nEdad: "+edad+"\n--------------------------\n");
    }
    void cumplirAños(){
        edad++;
    }
}
