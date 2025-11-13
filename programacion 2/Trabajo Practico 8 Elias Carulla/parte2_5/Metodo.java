package parte2_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Metodo {
	public static void leerTXT(String ruta) {
		File archivo = new File(ruta);
		
		try(BufferedReader br = new BufferedReader(new FileReader(archivo));){
			System.out.println(br.readLine());
		}catch(FileNotFoundException e ) {
			System.out.println("Archivo no encontrado");
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			System.out.println("se cerro el buffer");
		}
	}
}
