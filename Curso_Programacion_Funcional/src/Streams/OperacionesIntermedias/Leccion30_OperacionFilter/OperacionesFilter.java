package Streams.OperacionesIntermedias.Leccion30_OperacionFilter;

import java.util.List;
import java.util.function.Predicate;

public class OperacionesFilter {
    public static void main(String[] args) {
        List<Empleado> empleados = Empleado.empleados();
        System.out.println("Empleados hombres");
        empleados.stream().filter(emp -> emp.esHombre())
                .forEach(empleado -> System.out.println(empleado.getNombre() + " " + empleado.getGenero()));

        System.out.println("\nEmpleados mujeres");
        empleados.stream().filter(Empleado::esMujer)
                .forEach(empleado -> System.out.println(empleado.getNombre() + " " + empleado.getGenero()));

        System.out.println("\nEmpleados mayores a 25 años");
        empleados.stream().filter(emp -> emp.getEdad() > 25)
                .forEach(empleado -> System.out.println(empleado.getNombre() + " " + empleado.getEdad()));

        // Filters anidados
        System.out.println("\nPersonal masculino que inicie con la letra A");
        empleados.stream().filter(Empleado::esHombre).filter(emp -> emp.getNombre().startsWith("A"))
                .forEach(empleado -> System.out.println(empleado.getNombre() + " " + empleado.getGenero()));

        // Consulta compleja
        System.out.println("\nPersonal masculino con ingresos arriba de 500");
        empleados.stream().filter(emp -> emp.esHombre() && emp.getIngresos() > 500)
                .forEach(empleado -> System.out.println(empleado.getNombre() + " " + empleado.getIngresos()));

        // Predicado compuesto - varios predicates
        System.out.println("\nPersonal femenino mayor de 25 años con ingresos arriba de 300");
        Predicate<Empleado> empFemenino = emp -> emp.esMujer();
        Predicate<Empleado> empEdad = emp -> emp.getEdad() > 25;
        Predicate<Empleado> empIngresos = emp -> emp.getIngresos() > 300;
        Predicate<Empleado> fem25300 = empFemenino.and(empEdad).and(empIngresos); // Predicados concatenados

        empleados.stream().filter(fem25300)
                .forEach(empleado -> System.out.println(empleado.getNombre()+  " " + empleado.getEdad() + " " + empleado.getGenero() + " " + empleado.getIngresos()));
        // Total empleados
        System.out.println("Cantidad total: " + empleados.stream().filter(fem25300).count());
    }
}