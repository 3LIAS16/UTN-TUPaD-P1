
package trabajopractico2;


public class Libro {
    
    private String titulo, autor;
    private int añoPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 1900) {
            this.añoPublicacion = añoPublicacion;
        }else{
            System.out.println("Año invalido");
        }
    }
    
    public void mostrarInfo(){
        System.out.println("--------------------------\n"+"Titulo: "+titulo+"\nAutor: "+autor+"\nFecha de publicacion: "+añoPublicacion+"\n--------------------------\n");
    }
    
}
