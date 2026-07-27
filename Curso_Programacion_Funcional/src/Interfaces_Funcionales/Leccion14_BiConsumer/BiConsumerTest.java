package Interfaces_Funcionales.Leccion14_BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerTest {
    public static void main(String[] args) {
        BiConsumer<Double, Double> biConsumer = (num1, num2) -> {
          double mult = num1 * num2;
            System.out.println("La multiplicación es: " + mult);
        };
        biConsumer.accept(15.2, 52.25);
    }
}