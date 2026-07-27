package Interfaces_Funcionales.Leccion13_Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Principal {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Carlos", 4.8),
                new Estudiante("Ana", 3.9),
                new Estudiante("Juan", 2.7),
                new Estudiante("María", 4.5),
                new Estudiante("Pedro", 3.2),
                new Estudiante("Laura", 5.0),
                new Estudiante("Sofía", 4.1),
                new Estudiante("Andrés", 2.9),
                new Estudiante("Camila", 3.7),
                new Estudiante("Daniel", 4.3)
        );

        OperacionEstudiantes op = new OperacionEstudiantes();

        // METODO ACCEPT DE CONSUMER

        /* Consumer<Estudiante> cons1 = e -> System.out.println("Nombre: " + e.getNombre()
                + " Calificación: " + e.getCalificacion());
        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion()*1.15);

        op.aceptaTodos(estudiantes, cons1);
        System.out.println("Con nueva nota: ");
        op.aceptaTodos(estudiantes, cons2);
        op.aceptaTodos(estudiantes, cons1);
         */

        // METODO ANDTHEN DE CONSUMER

        Consumer<Estudiante> cons1 = e -> System.out.println("Nombre: " + e.getNombre()
                + " Calificación: " + e.getCalificacion());
        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion()*1.15);
        Consumer<Estudiante> cons3 = cons2.andThen(cons1);

        System.out.println("Con metodo andThen");
        op.aceptaTodos(estudiantes, cons3);
    }
}