package Streams.OperacionesIntermedias.Leccion32_OperacionSorted;

import Streams.OperacionesIntermedias.Leccion30_OperacionFilter.Empleado;

import java.util.Arrays;
import java.util.List;

public class OperacionesSorted {
    public static void main(String[] args) {
//        System.out.println("Nombres ordenados:");
//        Arrays.asList("Maria", "Daniel", "Brenda", "Alfredo")
//                .stream().sorted().forEach(System.out::println);
//        System.out.println("\nNúmeros ordenados:");
//        Arrays.asList(1,2,7,8,9,1,5,2,1,5,3,5)
//                .stream().sorted().forEach(System.out::println);
        System.out.println("Empleados ordenados por nombre alfabeticamente:");
        List<Empleado> empleados = Empleado.empleados();
        empleados.stream()
                .sorted().forEach(empleado -> System.out.println(empleado.getNombre()));

        System.out.println("\nEmpleados ordenados por edad:");
        empleados.stream().sorted((emp1,emp2) -> emp1.getEdad() - emp2.getEdad())
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getEdad()));

        System.out.println("\nEmpleados ordenados por su salario y mayores de 25:");
        empleados.stream().filter(emp -> emp.getEdad() > 25)
                .sorted((emp1, emp2) -> (int)(emp1.getIngresos() - emp2.getIngresos()))
                .forEach(emp -> System.out.println(emp.getNombre() + " " + emp.getIngresos()));
    }
}