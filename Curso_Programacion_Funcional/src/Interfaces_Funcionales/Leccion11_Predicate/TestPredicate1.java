package Interfaces_Funcionales.Leccion11_Predicate;

import java.util.function.Predicate;

public class TestPredicate1 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (valor) -> valor > 0;
        // Predicate evalua si es verdadera o falsa la expresión lambda
        System.out.println(predicate.test(-1));
    }
}