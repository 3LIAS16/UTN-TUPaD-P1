package parte1;

public class Cliente implements Notificable{
	private String nombre;
	private Pedido pedido;
	
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	public void añadirProducto(Producto p) {
		this.pedido.añadirProducto(p);
	}

	public void hacerPedido() {
		this.pedido=new Pedido(this);
	}
	
	@Override
	public void notificar(String mensaje) {
		System.out.println(mensaje);
	}

}
