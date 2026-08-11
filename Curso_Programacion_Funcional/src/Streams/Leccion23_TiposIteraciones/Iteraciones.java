package Streams.Leccion23_TiposIteraciones;

import java.util.Arrays;
import java.util.List;

public class Iteraciones {
    public static void main(String[] args) {

        // Iteración externa
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        // Utilizamos esta variable para hacer operaciones mutables
        int suma = 0;
        for (int num: numeros) {
            if (num % 2 == 1) {
                int cuadrado = num * num;
                suma = suma + cuadrado;
            }
        }
        System.out.println("Resultado de la suma de cuadrados: " + suma);

        // Iteración interna
        // Filter y map son las intermedias. Reduce es la operación terminal
        int suma2 = numeros.stream().filter(n -> n % 2 ==1).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println("Resultado con streams: " + suma2);
    }
}