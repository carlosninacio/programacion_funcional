package Streams.Leccion26_CrearStreamFunciones;

import java.util.Random;
import java.util.stream.Stream;

public class CrearStream2 {
    public static void main(String[] args) {
        Stream<Long> primerosDiez = Stream.iterate(1L, n -> n + 2).limit(10);
        primerosDiez.forEach(System.out::println);

        System.out.println(" ");
        // Filtrar solo para los números pares
        Stream.iterate(1L, n -> n + 1).filter(n -> n % 2 == 0).limit(10).forEach(System.out::println);

        System.out.println("\nDespués de 100");
        Stream.iterate(1L, n -> n + 1).filter(n -> n % 2 == 0).skip(100).limit(5).forEach(System.out::println);

        System.out.println("\nNúmeros aleatorios");
        Stream.generate(Math::random).limit(5).forEach(System.out::println);

        System.out.println("\nEnteros aleatorios");
        new Random().ints().limit(5).forEach(System.out::println);
    }
}