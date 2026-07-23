package Interfaces_Funcionales.Leccion10_BiFunction;

public class EjercicioBiFunction2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        String resultado = calculadora.calc((x,y) -> ": " + (x * y), 2, 8);
        System.out.println("El resultado es: " + resultado);
    }
}