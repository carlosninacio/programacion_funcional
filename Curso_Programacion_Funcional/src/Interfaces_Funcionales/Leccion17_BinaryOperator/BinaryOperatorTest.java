package Interfaces_Funcionales.Leccion17_BinaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> bOperator = (x,y) -> x * y;

        // Aplicando el metodo apply
        int resultado = bOperator.apply(10, 20);
        System.out.println(resultado);

        // Uso del metodo minBy
        BinaryOperator<Integer> bOptMin = BinaryOperator.minBy((Integer t1, Integer t2) -> t1.compareTo(t2));
        resultado = bOptMin.apply(10,20);
        System.out.println(resultado);

        // Uso del metodo maxBy
        BinaryOperator<Integer> bOptMax = BinaryOperator.maxBy((Integer t1, Integer t2) -> t1.compareTo(t2));
        resultado = bOptMax.apply(10,20);
        System.out.println(resultado);
    }
}