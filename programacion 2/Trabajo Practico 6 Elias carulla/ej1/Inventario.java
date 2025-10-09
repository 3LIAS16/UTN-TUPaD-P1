package ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
	private ArrayList<Producto> productos = new ArrayList<>();
	
	
	
	public void agregarProducto(Producto p) {
		if(!productos.contains(p)) {
		productos.add(p);
		System.out.println(p.getNombre()+" agregado");
		}
	}
	public void listarProductos() {
		System.out.println("Lista de productos:");
		for (Producto p : productos) {
			System.out.println(productos.indexOf(p)+1+") "+p.getNombre()+" - Stock: "+p.getCantidad());
			
		}
	}
	
	public Producto buscarProductoPorId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la id a buscar: ");
		int id=sc.nextInt();
		int contador=0;
		while (contador!=id && contador!=(productos.size()+1)) {
			contador++;
		}
		if(contador==(productos.size()+1)) {
			System.out.println("producto no encontrado");
			return null;
		}else {
			Producto producto = productos.get(id);
			return producto;
		}
		
	}
	
	
}
