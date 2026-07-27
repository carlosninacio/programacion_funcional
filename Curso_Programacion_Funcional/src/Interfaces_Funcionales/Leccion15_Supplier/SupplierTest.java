package Interfaces_Funcionales.Leccion15_Supplier;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        // Lo que se quiere devolver debe ser del tipo en especifico del que se indica a la referencia
        Supplier<String> i = () -> "Carlos";
        System.out.println("El valor es: " + i.get());
    }
}