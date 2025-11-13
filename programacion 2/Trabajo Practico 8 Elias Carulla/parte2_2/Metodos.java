package parte2_2;

public class Metodos {
	public static int convertirANumero(String texto) {
		try {
			return (Integer.parseInt(texto));
		}catch(NumberFormatException e) {
			System.out.println("ERROR: no se puede pasar de texto a numero");
		}
		return 0;
		
	}
		
	
}
