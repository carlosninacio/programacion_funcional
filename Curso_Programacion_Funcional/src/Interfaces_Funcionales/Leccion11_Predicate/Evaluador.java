package Interfaces_Funcionales.Leccion11_Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Evaluador {
    public List<Empleado> evaluar(List<Empleado> listEmp, Predicate<Empleado> eval) {
        List<Empleado> listaNueva = new ArrayList<>();

        for (Empleado empleado : listEmp) {
            // Si cumple la condición se añade a la lista nueva
            if (eval.test(empleado)) {
                listaNueva.add(empleado);
            }
        }
        return listaNueva;
    }

    // Lección 12, uso del metodo negate
    public List<Empleado> evaluarAlContrario(List<Empleado> listEmp, Predicate<Empleado> eval) {
        List<Empleado> listaNueva = new ArrayList<>();

        for (Empleado empleado : listEmp) {
            // Va a hacer lo contrario de la expresión lambda para posteriormente
            // realizar el test
            if (eval.negate().test(empleado)) {
                listaNueva.add(empleado);
            }
        }
        return listaNueva;
    }
}