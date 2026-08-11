package Streams.Leccion24_Ejercicio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        Stream<Integer> numStream = numeros.stream();

        int sumaImpares = numStream
                .filter(n -> n%2 == 1) // se filtran los impares y quedan {1,3,5}
                .map(n -> n * n) // Se multiplica el mismo número de la iteración por si mismo y queda {1, 9 , 25}
                .reduce(0, (n1,n2) -> n1 + n2); // Operación terminal
        System.out.println("La suma de los números imapres es: " + sumaImpares);
    }
}