package parte1;

import java.util.ArrayList;

public class Pedido implements Pagable {
	private boolean pagado;
	private Cliente cliente;
	private ArrayList<Producto> productos;

	
	
	

	
	public Pedido(Cliente cliente) {
		productos=new ArrayList<>();
		this.pagado = false;
		this.cliente = cliente;
	}

	
	
	public void añadirProducto(Producto p) {
		this.productos.add(p);
		this.cliente.notificar("se ha añadido "+p.getNombre()+" al carrito");
	}
	
	
	
	@Override
	public double CalcularTotal() {
		double total=0;
		for(Producto p:productos) {
			total+=p.CalcularTotal();
		}
		return total;
	}

}
