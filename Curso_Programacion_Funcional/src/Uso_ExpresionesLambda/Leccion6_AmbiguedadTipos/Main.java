package Uso_ExpresionesLambda.Leccion6_AmbiguedadTipos;

public class Main {
    public static void main(String[] args) {
        System.out.println(create().calculate(2,2));
    }

    private static CalculadoraLong create() {
        return (x,y) -> x / y;
    }
}