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
}