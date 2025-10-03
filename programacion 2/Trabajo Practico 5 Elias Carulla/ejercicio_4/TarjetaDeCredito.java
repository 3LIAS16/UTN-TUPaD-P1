package ejercicio_4;

public class TarjetaDeCredito {
	private String numero, fechaVencimiento;
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
		if (cliente != null && cliente.getTarjeta() != this) {
			cliente.setTarjeta(this);
		}
	}

	private Banco banco;

	public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
		this.numero = numero;
		this.fechaVencimiento = fechaVencimiento;
		this.banco = banco;
	}
}
