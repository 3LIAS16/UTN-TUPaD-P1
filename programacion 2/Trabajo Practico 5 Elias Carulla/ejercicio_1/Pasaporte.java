package ejercicio_1;

public class Pasaporte {
	private String numero, fechaEmision;
	private Foto foto;
	private Titular titular;

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
		if (titular !=null && titular.getPasaporte()!=this) {
			titular.setPasaporte(this);
		}
	}

	public Pasaporte(String numero, String fechaEmision, String formato, String imagen) {
		this.numero = numero;
		this.fechaEmision = fechaEmision;
		this.foto = new Foto(formato,imagen);
	}
	
}
