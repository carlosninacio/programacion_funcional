package Interfaces_Funcionales.Leccion12_BiPredicate;

import java.util.function.BiPredicate;

public class TestBiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bp = (x, y) -> x < y;
        System.out.println(bp.test(2,3));
    }
}