package Streams.Leccion28_CrearStreamsStrings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class CrearStream4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        IntStream streamChars = entrada.chars();

        streamChars.filter(n -> !Character.isDigit((char) n) && !Character.isWhitespace((char) n))
                .forEach(n -> System.out.print((char) n));

        System.out.println("\nStream fraccionado");
        String str = "HTML, CSS, JAVASCRIPT, PYTHON";
        Pattern.compile(", ").splitAsStream(str).forEach(System.out::println);
    }
}