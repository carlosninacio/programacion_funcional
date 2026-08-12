package Streams.Leccion27_CrearStreamsColecciones;

import Streams.Leccion25_CrearStreams.Estudiante;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrearStream3 {
    public static void main(String[] args) {
        IntStream numStream = Arrays.stream(new int[]{1,2,3,4,5,6});
        numStream.forEach(System.out::println);
        System.out.println("");
        Stream<String> nombres = Arrays.stream(new String[]{"Juan", "Pedro", "Maria"});
        nombres.forEach(System.out::println);

        Set<String> lenguajesSet = new HashSet<>();
        lenguajesSet.add("Java");
        lenguajesSet.add("C++");
        lenguajesSet.add("C#");
        System.out.println("");
        Stream<String> lenguajesStream = lenguajesSet.stream();
        lenguajesStream.forEach(System.out::println);

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("n01", 18, 167, 9.2));
        estudiantes.add(new Estudiante("n02", 14, 160, 9.5));
        estudiantes.add(new Estudiante("n03", 20, 170, 9.1));
        estudiantes.add(new Estudiante("n04", 15, 189, 8.5));

        System.out.println("\nStream de estudiantes");
        Stream<Estudiante> estudiantesStream = estudiantes.parallelStream();
        estudiantesStream.forEach(estudiante -> System.out.println(estudiante.getIdentificacion()));
    }
}