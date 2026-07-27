package Interfaces_Funcionales.Leccion12_BiPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

/*
Se requiere obtener un reporte con todos los empleados que cumplan con alguno de estos dos
conjuntos de criterios:

1. 25 años en adelante y que estén en el departamento de Ventas o
2. 25 años en adelante y que estén en mostrador
 */

public class Principal {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Carlos", 20, 1400, "Mostrador"),
                new Empleado("Karen", 22, 1500, "Ventas"),
                new Empleado("Kiwi", 34, 16000, "Ventas"),
                new Empleado("Samy", 64, 150, "Programación"),
                new Empleado("Lola", 55, 300, "Cocina"),
                new Empleado("Eva", 18, 260, "Ventas"),
                new Empleado("Tony", 21, 100000, "Mostrador"),
                new Empleado("Bonie", 33, 1380, "Repostero"),
                new Empleado("Oreo", 30, 1238, "Ventas"),
                new Empleado("Minnie", 55, 12367, "Diseñador"),
                new Empleado("Jairo", 54, 15000, "Celador"),
                new Empleado("Alberto", 45, 980, "Mostrador"),
                new Empleado("Cristian", 43, 740, "Ventas"),
                new Empleado("Julian", 44, 980, "Mesero"),
                new Empleado("Fara", 38, 23000, "Mostrador")
                );

        Evaluador evaluador = new Evaluador();
        BiPredicate<Integer, String> primerCriterio = (edad, departamento) -> (edad >= 25)
                && (departamento.equals("Ventas"));
        BiPredicate<Integer, String> segundoCriterio = (edad, departamento) -> (edad >= 25)
                && (departamento.equals("Mostrador"));

        // Tercer criterio que corresponde a los dos criterios que pide el ejercicio
        BiPredicate<Integer, String> criterio = primerCriterio.or(segundoCriterio);

        System.out.println("Empleados de mostrador o ventas mayores de 25 años:");
        List<Empleado> listaActualizada = evaluador.evaluar(listaEmpleados, criterio);
        for (Empleado empleado : listaActualizada) {
            System.out.println(empleado.getNombre() + " " + empleado.getEdad() + " " + empleado.getDepartamento());
        }

    }
}