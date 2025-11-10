package ejercicio4;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Animal>animales = new ArrayList<>();
		
		Animal vaca = new Vaca();
		Animal perro = new Perro();
		Animal gato = new Gato();
		animales.add(perro);
		animales.add(vaca);
		animales.add(gato);
		
		for(Animal a:animales) {
			a.describirAnimal();
			a.hacerSonido();
		}
	}

}
