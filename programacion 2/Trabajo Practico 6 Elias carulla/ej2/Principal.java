package ej2;

public class Principal {

	public static void main(String[] args) {
		Biblioteca alejandria = new Biblioteca("alejandria");
		
		Autor pequeñoJ = new Autor("J", "peruano");
		Autor pepe = new Autor("pepe", "chileno");
		Autor mono = new Autor("mono", "zimbabuense");
		
		alejandria.agregarLibro("856", "como hacer talco", 2020, pequeñoJ);
		alejandria.agregarLibro("2315", "las aventuras de mesi", 2010, mono);
		alejandria.agregarLibro("3425", "como sobrevivir a un terremoto", 2020, pepe);
		alejandria.agregarLibro("23", "donde encontrar agua?", 1999, mono);
		alejandria.agregarLibro("458", "mi vida en la carcel", 2025, pequeñoJ);
		
		alejandria.listarLibros();
		System.out.println("----------------");
		alejandria.buscarLibroporIsbn("856");
		System.out.println("----------------");
		alejandria.filtrarLibrosPorAnio(2020);
		System.out.println("----------------");
		alejandria.eliminarLibro("458");
		alejandria.listarLibros();
		System.out.println("----------------");
		alejandria.obtenerCantLibros();
		System.out.println("----------------");
		alejandria.mostrarAutoresDisponibles();
	}

}
