
package trabajopractico2;


public class Estudiante {
    
    private String nombre="nico", apellido="gonzales", curso="2";
    private double calificacion=8;
    
    void mostrarInfo(){
        System.out.println("--------------------------\n"+"Nombre: "+nombre+"\nApellido: "+apellido+"\nCurso: "+curso+"\nCalificacion: "+calificacion+"\n--------------------------\n");
    }
    void subirCailifacion(double puntos){
        if(puntos>0){
            calificacion+=puntos;
        }
    }
    void bajarCailifacion(double puntos){
        if(puntos>0 && puntos<calificacion){
            calificacion-=puntos;
        }
    }
    
}
