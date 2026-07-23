package Interfaces_Funcionales.Leccion10_BiFunction;

import java.util.function.BiFunction;

public class EjercicioBiFunction {
    public static void main(String[] args) {
        // La interfaz bifunction recibe dos parametros y da un retorno
        // La function solo recibia un parametro
        BiFunction<String, String, String> bi = (x,y) -> x + " " + y;
        System.out.println(bi.apply("Hola", "Mundo"));
    }
}