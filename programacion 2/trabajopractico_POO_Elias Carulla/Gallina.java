
package trabajopractico2;

public class Gallina {
    
    private static int contador=0;
 
    private int edad, huevosPuestos, idGallina;
    
    //constructor para que cada gallina tenga una id diferente
    public Gallina(){
        contador++;
        this.idGallina = contador;
    }
    
    void ponerHuevo(){
        huevosPuestos++;
    }
    void envejecer(){
        edad++;
    }
    void mostrarEstado(){
         System.out.println("--------------------------\n"+"Id de la gallina: "+idGallina+"\nEdad: "+edad+"\nHuevos Puestos: "+huevosPuestos+"\n--------------------------\n");
    }
}
