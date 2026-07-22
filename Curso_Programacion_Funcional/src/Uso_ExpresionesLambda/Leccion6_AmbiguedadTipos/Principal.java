package Uso_ExpresionesLambda.Leccion6_AmbiguedadTipos;

public class Principal {

    public static void main(String[] args) {
        // Manera 1: engine((long x, long y) -> x + y);
        // Manera 2: con cast
        engine((CalculadoraLong) (x,y) -> x + y);
        // Manera 3: crear referencias
        CalculadoraInt calI = (x,y) -> x+y;
        engine(calI);
    }

    public static void engine(CalculadoraInt cal) {

    }

    public static void engine(CalculadoraLong cal) {

    }
}