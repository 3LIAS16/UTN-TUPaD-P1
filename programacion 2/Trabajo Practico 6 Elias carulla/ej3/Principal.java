
package ej3;

public class Principal {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional de la Patagonia");

        // Crear profesores
        Profesor p1 = new Profesor("P001", "Ana Torres", "Matematica");
        Profesor p2 = new Profesor("P002", "Luis Mendez", "Fisica");
        Profesor p3 = new Profesor("P003", "Sofia Rios", "Informatica");

        // Crear cursos
        Curso c1 = new Curso("C001", "Algebra");
        Curso c2 = new Curso("C002", "Calculo");
        Curso c3 = new Curso("C003", "Mecanica");
        Curso c4 = new Curso("C004", "Electromagnetismo");
        Curso c5 = new Curso("C005", "Programacion");

        // Agregar a universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asignar profesores
        uni.asignarProfesorACurso("C001", "P001");
        uni.asignarProfesorACurso("C002", "P001");
        uni.asignarProfesorACurso("C003", "P002");
        uni.asignarProfesorACurso("C004", "P002");
        uni.asignarProfesorACurso("C005", "P003");

        // Listar
        System.out.println("\n--- Cursos ---");
        uni.listarCursos();
        System.out.println("\n--- Profesores ---");
        uni.listarProfesores();

        // Cambiar profesor
        System.out.println("\n--- Cambio de Profesor ---");
        uni.asignarProfesorACurso("C001", "P003");

        // Verificar sincronización
        c1.mostrarInfo();
        p1.listarCursos();
        p3.listarCursos();

        // Eliminar curso
        System.out.println("\n--- Eliminar curso C003 ---");
        uni.eliminarCurso("C003");
        uni.listarCursos();
        p2.listarCursos();

        // Eliminar profesor
        System.out.println("\n--- Eliminar profesor P002 ---");
        uni.eliminarProfesor("P002");
        uni.listarCursos();

        // Reporte
        System.out.println("\n--- Reporte final ---");
        uni.reporteCursosPorProfesor();
    }
}
