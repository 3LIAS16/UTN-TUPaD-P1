package ejercicio_2;

public class Celular {
	private String imei, marca, modelo;
	private Bateria bateria;
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
		if(usuario!=null && usuario.getCelular()!=this) {
			usuario.setCelular(this);
		}
	}

	public Celular(String imei, String marca, String modelo, Bateria bateria) {
		this.imei = imei;
		this.marca = marca;
		this.modelo = modelo;
		this.bateria = bateria;
	}

}
