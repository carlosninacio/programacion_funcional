package Interfaces_Funcionales.Leccion11_Predicate;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados =
                Arrays.asList(
                        new Empleado("Karen", 19, 1500, "Bacteriologa"),
                        new Empleado("Carlos", 35, 2500, "Programador"),
                        new Empleado("Kiwi", 22, 8000, "Marketing"),
                        new Empleado("Bonie", 56, 150, "Videojuegos"),
                        new Empleado("Tony", 20, 1900, "Limpieza"),
                        new Empleado("Minnie", 38, 1000, "Comida"),
                        new Empleado("Sammy", 41, 15100, "Portera"),
                        new Empleado("Lola", 35, 1600, "Delantera"),
                        new Empleado("Eva", 23, 2700, "Defensa"),
                        new Empleado("Oreo", 42, 8500, "Directora")
                );

        Evaluador evaluador = new Evaluador();
        // Obtener los que tengan salarios por encima de los 5mil
        System.out.println("Empleados con salarios > 5000");
        List<Empleado> empSalariosAltos = evaluador.evaluar(listaEmpleados,
                empleado -> empleado.getSalario() > 5000);

        for (Empleado empleado : empSalariosAltos) {
            System.out.println(empleado.getNombre());
        }

        System.out.println("\nEmpleados que su nombre inicia con K: ");
        List<Empleado> empNombresK = evaluador.evaluar(listaEmpleados,
                empleado -> empleado.getNombre().startsWith("K"));
        for (Empleado empleado : empNombresK) {
            System.out.println(empleado.getNombre());
        }

        System.out.println("\nEmpleados que sean menores de 25 años: ");
        List<Empleado> empJovenes = evaluador.evaluar(listaEmpleados,
                empleado -> empleado.getEdad() <= 25);
        for (Empleado empleado : empJovenes) {
            System.out.println(empleado.getNombre() + " -> " + empleado.getEdad());
        }

        // Lección 12 - Predicate + BiFunction
        // Ejemplo: Programa en que a los empleados jovenes se les incrementa el salario

        L12_Funciones func = new L12_Funciones();
        for (Empleado empleado : empJovenes) {
            double nuevoSalario = func.incrementoSalario(empleado, 10,
                    (salario, incremento) -> salario + (salario * (incremento/100)));
            empleado.setSalario(nuevoSalario);
        }

        System.out.println("\nSalarios actualizados en los jóvenes:");
        for (Empleado empleado : empJovenes) {
            System.out.println(empleado.getNombre() + " -> " + empleado.getSalario());
        }

        System.out.println("\nEmpleados que sean mayores de 25 años: ");
        List<Empleado> empMayores = evaluador.evaluarAlContrario(listaEmpleados,
                empleado -> empleado.getEdad() <= 25);
        for (Empleado empleado : empMayores) {
            System.out.println(empleado.getNombre() + " -> " + empleado.getEdad());
        }
    }
}