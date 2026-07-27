package Interfaces_Funcionales.Leccion13_Consumer;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> cons = x -> System.out.println(x.toUpperCase());
        cons.accept("Hola Mundo desde accept de consumer");
    }
}