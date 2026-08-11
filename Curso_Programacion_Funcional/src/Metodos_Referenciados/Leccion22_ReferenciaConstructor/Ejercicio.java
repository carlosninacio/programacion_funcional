package Metodos_Referenciados.Leccion22_ReferenciaConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ejercicio {
    public static void main(String[] args) {
        List<String> numerosStr =
                Arrays.asList("10","10", "15", "15", "25", "30", "40", "6", "30");
        // getResults(numeros, (numeroString) -> new Integer(numeroString));
        // getResults(numerosStr, Integer::new).forEach(num -> System.out.println(num));
        // getResults(numerosStr, Integer::new).forEach(num -> Ejercicio.multiplicarPor10(num));
        getResults(numerosStr, Integer::new).forEach(Ejercicio::multiplicarPor10);
    }

    public static List<Integer> getResults(List<String> datos, Function<String, Integer> func) {
        List<Integer> resultados = new ArrayList<>();
        datos.forEach(strNum -> resultados.add(func.apply(strNum)));
        return resultados;
    }

    public static void multiplicarPor10(int numero) {
        System.out.println("El nuevo valor del dato " + numero + " es: " + numero * 10);
    }
}