package Metodos_Referenciados.Leccion20_ReferenciadoInstancia;

import Metodos_Referenciados.Leccion19_Introduccion.Persona;

public class ProveedorComparaciones {
    public int compararPorNombre (Persona per1, Persona per2) {
        return per1.getNombre().compareTo(per2.getNombre());
    }

    public int compararPorEdad (Persona per1, Persona per2) {
        return per1.getEdad().compareTo(per2.getEdad());
    }
}