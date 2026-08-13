package Streams.OperacionesIntermedias.Leccion31_OperacionMap;

import Streams.OperacionesIntermedias.Leccion30_OperacionFilter.Empleado;

import java.util.List;
import java.util.stream.IntStream;

public class OperacionesMap {
    public static void main(String[] args) {
//        IntStream.rangeClosed(1,5)
//                .map(num -> num * num)
//                .forEach(System.out::println);
//
//        System.out.println("");
//        IntStream.rangeClosed(1,10).map(n -> n * 2)
//                .forEach(System.out::println);

        List<Empleado> empleados = Empleado.empleados();
        System.out.println("Promedio de ingresos por personal femenino mayor de 25 años:");
        double suma = empleados.stream().filter((emp -> emp.esMujer() && emp.getEdad() > 25))
                .mapToDouble(Empleado::getIngresos)
                .sum();
        double promedio = suma / empleados.stream().filter((emp -> emp.esMujer() && emp.getEdad() > 25)).count();
        System.out.println(promedio);
    }
}