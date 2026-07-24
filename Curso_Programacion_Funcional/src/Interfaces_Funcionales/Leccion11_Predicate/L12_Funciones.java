package Interfaces_Funcionales.Leccion11_Predicate;

import java.util.function.BiFunction;

public class L12_Funciones {
    public double incrementoSalario(Empleado emp, double incremento,
                                    // Salario, Porcentaje de incremento, Valor a devolver
                                    BiFunction<Double, Double, Double> biFun) {
        return biFun.apply(emp.getSalario(), incremento);
    }
}