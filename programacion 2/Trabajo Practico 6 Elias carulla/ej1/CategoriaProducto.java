package ej1;

import java.util.Scanner;

public enum CategoriaProducto {

	ALIMENTOS("Productos comestibles"), ELECTRONICA("Dispositivos electrónicos"), ROPA("Prendas de vestir"),
	HOGAR("Artículos para el hogar");

	private final String descripcion;

	CategoriaProducto(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public static CategoriaProducto seleccionarCategoria(String producto) {
		Scanner sc = new Scanner(System.in);
		CategoriaProducto categorias[] = CategoriaProducto.values();

		for (CategoriaProducto a : categorias) {
			System.out.println(a.ordinal() + 1 + "- " + a);
		}
		System.out.println("seleccione la categoria para el producto '" + producto + "': ");
		int opcion = sc.nextInt();
		while (opcion < 1 || opcion > 4) {
			for (CategoriaProducto a : categorias) {
				System.out.println(a.ordinal() + 1 + "- " + a);
			}
			System.out.println("opcion invalida");
			System.out.println("seleccione la categoria para el producto '" + producto + "': ");
			opcion = sc.nextInt();
		}

		switch (opcion) {
		case 1:
			return ALIMENTOS;
		case 2:
			return ELECTRONICA;
		case 3:
			return ROPA;
		case 4:
			return HOGAR;
		default:
			return null;
		}
	}

}
