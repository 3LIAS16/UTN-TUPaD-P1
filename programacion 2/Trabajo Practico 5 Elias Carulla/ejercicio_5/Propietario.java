package ejercicio_5;

public class Propietario {
private String nombre, dni;
private Computadora computadora;
public Computadora getComputadora() {
	return computadora;
}
public void setComputadora(Computadora computadora) {
	this.computadora = computadora;
	if(computadora!=null && computadora.getPropietario()!=this) {
		computadora.setPropietario(this);
	}
}


}
