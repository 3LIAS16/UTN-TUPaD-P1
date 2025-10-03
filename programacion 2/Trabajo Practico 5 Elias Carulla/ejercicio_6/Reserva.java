package ejercicio_6;

public class Reserva {
private String fecha;
private int hora;
private Cliente cliente;
private Mesa mesa;

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
public Reserva(String fecha, int hora, Mesa mesa) {
	this.fecha = fecha;
	this.hora = hora;
	this.mesa = mesa;
}


}
