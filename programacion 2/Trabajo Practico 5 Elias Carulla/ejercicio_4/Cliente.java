package ejercicio_4;

public class Cliente {
	private String nombre, dni;
	private TarjetaDeCredito tarjeta;

	public TarjetaDeCredito getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(TarjetaDeCredito tarjeta) {
		this.tarjeta = tarjeta;
		if(tarjeta!=null&& tarjeta.getCliente()!=this) {
			tarjeta.setCliente(this);
		}
	}

}
