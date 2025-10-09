package ej1;

public class Principal {

	public static void main(String[] args) {
		Inventario inventario = new Inventario();
		Producto papa = new Producto("papa", 3.0, 100);
		Producto manzana = new Producto("manzana", 3.0, 324);
		Producto celular = new Producto("celular", 3.0, 23);
		System.out.println("-----------------------");
		papa.mostrarInfo();
		celular.mostrarInfo();
		manzana.mostrarInfo();
		System.out.println("-----------------------");
		inventario.agregarProducto(papa);
		inventario.agregarProducto(manzana);
		inventario.agregarProducto(celular);
		System.out.println("-----------------------");
		inventario.listarProductos();
		System.out.println("-----------------------");
		
		Producto productoBuscado=inventario.buscarProductoPorId();
		productoBuscado.mostrarInfo();
	}

}
