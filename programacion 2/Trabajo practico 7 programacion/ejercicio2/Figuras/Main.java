
package Figuras;

import java.util.ArrayList;


public class Main {

   
    public static void main(String[] args) {
        ArrayList<Figura> figuras= new ArrayList<>();
        
        figuras.add(new Circulo(3.5,"Circulo 1"));
        figuras.add(new Rectangulo(4, 6, "Rectangulo 1"));
        figuras.add(new Circulo(2, "Circulo 2"));
        
        for (Figura f : figuras){
            System.out.println("Figura: " + f.getNombre());
            System.out.println("Area: " +f.calcularArea());
            System.out.println("--------------------------");
        }
        
        
    }    
        
    
}
