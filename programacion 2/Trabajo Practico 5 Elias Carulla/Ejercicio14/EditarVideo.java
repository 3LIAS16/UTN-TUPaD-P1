
package Ejercicio14;


public class EditarVideo {
    public void exportar(String formato,Proyecto proyecto){
        Render render = new Render(formato);
        render.setProyecto(proyecto);
    }
}
