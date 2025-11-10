
package Figuras;


public class Rectangulo extends Figura{
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea (){
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    
    
    
}
