package ejercicio_5;

public class Computadora {
private String marca, numeroSerie;
private PlacaMadre placaMadre;
private Propietario propietario;
public Propietario getPropietario() {
	return propietario;
}
public void setPropietario(Propietario propietario) {
	this.propietario = propietario;
	if(propietario!=null&&propietario.getComputadora()!=this) {
		propietario.setComputadora(this);
	}
}
public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
	super();
	this.marca = marca;
	this.numeroSerie = numeroSerie;
	this.placaMadre = new PlacaMadre(modelo, chipset);
}

}
