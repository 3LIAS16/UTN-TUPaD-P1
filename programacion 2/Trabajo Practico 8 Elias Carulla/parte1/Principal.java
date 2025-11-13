package parte1;

public class Principal {

	public static void main(String[] args) {

		Producto sapayo = new Producto(238475.9, "sapayo");
		Cliente pepe = new Cliente("pepe");
		
		pepe.hacerPedido();
		pepe.añadirProducto(sapayo);
		
		
		
	}

}
