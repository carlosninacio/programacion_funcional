package Streams.OperacionesTerminales.Leccion33_Operaciones;

import Streams.OperacionesIntermedias.Leccion30_OperacionFilter.Empleado;

import java.util.List;
import java.util.stream.IntStream;

public class OperacionesReduccion {
    public static void main(String[] args) {
        // Las operaciones de reducción combinan todos los elementos de un stream y devuelve un solo valor
        // Operaciones SIN USO DE STREAMS
        // arreglo de números
        int[] numeros = {4,6,10,12,15,55,7,8,9,10,2,5,8,9,10,45,6,9,33,66,85,97,81,24,99};

        // suma de elementos
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma es: " + suma);

        // Promedio
        double promedio = (double) suma / numeros.length;
        System.out.println("El promedio es: " + promedio);

        // Cuenta de elementos
        System.out.println("Cantidad de elementos: " + numeros.length);

        // Obtener el máximo
        int maximo = numeros[0];
        for (int numero: numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        System.out.println("El maximo es: " + maximo);

        System.out.println("\nOperaciones de reducción con empleados");
        List<Empleado> empleados = Empleado.empleados();

        // suma de salarios
        double sumaSalarios = 0.0;
        for (Empleado empleado : empleados) {
            sumaSalarios += empleado.getIngresos();
        }
        System.out.println("La suma de los salarios es: " + sumaSalarios);

        // MISMAS OPERACIONES HECHAS CON STREAMS / PROGRAMACIÓN FUNCIONAL
        // suma de los elementos
        System.out.println("\nLa suma es: " + IntStream.of(numeros).sum()); // Es mucho mas sencillo

        // Obtener promedio de los elementos
        System.out.println("El promedio es: " + IntStream.of(numeros).average().getAsDouble());

        // Obtener minimo y maximo
        System.out.println("El valor maximo es: " + IntStream.of(numeros).max().getAsInt());
        System.out.println("El valor minimo es: " + IntStream.of(numeros).min().getAsInt());

        // Obtener cantidad de elementos
        System.out.println("Cantidad de elementos: " + IntStream.of(numeros).count());

        // sumar los salarios de todos los empleados
        System.out.println("\nOperaciones con empleados y Streams");
        System.out.println("Suma de salarios: " + empleados.stream().mapToDouble(Empleado::getIngresos).sum());

        // Obtener el empleado con el salario maximo
        Empleado empMax = empleados.stream().max()
    }
}