package ejercicio_1;

public class Titular {
private String nombre, dni;
private Pasaporte pasaporte;

public Titular(String nombre, String dni) {
	this.nombre = nombre;
	this.dni = dni;
}

public Pasaporte getPasaporte() {
	return pasaporte;
}

public void setPasaporte(Pasaporte pasaporte) {
	this.pasaporte = pasaporte;
	if(pasaporte!=null && pasaporte.getTitular()!=this) {
		pasaporte.setTitular(this);
	}
}

}
