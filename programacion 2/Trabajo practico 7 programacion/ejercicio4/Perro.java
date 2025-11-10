package ejercicio4;

public class Perro extends Animal{
	
	@Override
	public void hacerSonido() {
		System.out.println("guau guau ");
	}

	@Override
	public void describirAnimal() {
		System.out.println("soy un perro");
	}
}
