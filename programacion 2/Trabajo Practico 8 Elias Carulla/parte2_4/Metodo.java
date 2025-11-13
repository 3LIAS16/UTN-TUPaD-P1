package parte2_4;

public class Metodo {

	public static void checkEdad(int edad) {
		if(edad>120||edad<0) {
			throw new EdadInvalidaException("Edad invalida");
		}else {
			System.out.println("Edad valida");
		}
	}

}
