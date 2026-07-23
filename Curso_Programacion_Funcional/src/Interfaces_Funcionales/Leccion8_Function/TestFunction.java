package Interfaces_Funcionales.Leccion8_Function;

import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
//        Function<Integer, String> convertidor2 = new Function<Integer, String>() {
//            @Override
//            public String apply(Integer integer) {
//                return "";
//            }
//        }; -> El metodo abstracto de esta interfaz es igual a la función lambda de abajo

        // Recibe integer y devuelve string
        Function<Integer, String> convertidor = x -> Integer.toString(x);

        System.out.println(convertidor.apply(3).length()); // El metodo apply recibe un parametro, en este caso 3
        // Y por la función lambda, lo convierte a string
        System.out.println(convertidor.apply(30).length());
    }
}