package Interfaces_Funcionales.Leccion10_BiFunction.Ejercicio2;

import java.util.Arrays;
import java.util.List;

public class EjercicioBiFunction3 {

    public static void main(String[] args) {
        List<Empleado> listaEmpleados =
                Arrays.asList(
                        new Empleado("Carlos", 2563.2),
                        new Empleado("Karen", 183.2),
                        new Empleado("Kiwi", 2648879.2),
                        new Empleado("Oreo", 2546.2),
                        new Empleado("Eva", 2522.2),
                        new Empleado("Minnie", 254.2),
                        new Empleado("Lola", 23.2),
                        new Empleado("Tony", 25553.2),
                        new Empleado("Bonie", 2123543.2),
                        new Empleado("Samy", 321653.2)
                );

        Calculadora2 cal = new Calculadora2();
        List<Double> salarios = cal.calc((salario, incremento) -> salario + (salario * (incremento/100)), listaEmpleados, 16.0);

        for(Double salario : salarios) {
            System.out.println(salario);
        }
    }
}