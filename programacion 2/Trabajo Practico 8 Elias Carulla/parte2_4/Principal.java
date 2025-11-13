package parte2_4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;
		System.out.println("Ingrese su edad: ");
		edad=sc.nextInt();
		Metodo.checkEdad(edad);
		
	}

}
