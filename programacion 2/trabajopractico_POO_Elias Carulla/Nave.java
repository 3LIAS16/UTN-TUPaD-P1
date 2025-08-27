
package trabajopractico2;


public class Nave {
    private String nombre="halcon milenario";
    private int combustible=50;
    private boolean despego = false;
    
    void despegar(){
        despego=true;
        System.out.println("La nave despego");
    }
    void avanzar(int distancia){
        if (despego) {
            if (combustible>distancia) {
            System.out.println("Se avanzaron "+distancia+" metros");
            combustible-=distancia;
            System.out.println("quedan "+combustible+ " litros de combustible");
        }else{
                System.out.println("combustible insuficiente");
            }
        }else{
            System.out.println("la nave no ah despegado todavia");
        }
    }
    void recargarCombustible(int combustible){
        if(combustible>0 && combustible<(1000-this.combustible)){
            this.combustible+=combustible;
        }
    }
    void mostrarEstado(){
        if (despego) {
            System.out.println("la nave "+nombre+" ah despegado, tiene "+combustible+" de combustible");
        }else{
            System.out.println(nombre+" no ha despegado todavia");
        }
    }

}
