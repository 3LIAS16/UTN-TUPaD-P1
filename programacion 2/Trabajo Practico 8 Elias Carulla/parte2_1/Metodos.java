package parte2_1;

public class Metodos {
	
	public static double dividir(int dividendo, int divisor) {
	if (divisor==0) {
		throw new ArithmeticException("No se puede dividir por 0");
	}else {
		return dividendo/divisor;
	}
	}
}
