package ejercicio_2;

public class Usuario {
	private String nombre, dni;
	private Celular celular;

	public Celular getCelular() {
		return celular;
	}

	public void setCelular(Celular celular) {
		this.celular = celular;
		if(celular!=null && celular.getUsuario()!=this) {
			celular.setUsuario(this);
		}
	}
}
