package Metodos_Referenciados.Leccion19_Introduccion;

import Metodos_Referenciados.Leccion20_ReferenciadoInstancia.ProveedorComparaciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Carlos", 20, "carlos@gmail.com"),
                new Persona("Karen", 18, "karen@gmail.com"),
                new Persona("Kiwi", 12, "kiwi@gmail.com")
        );

        System.out.println("Personas sin ordenar: ");
        personas.forEach(p -> System.out.println(p));
        System.out.println(" ");

        // Collections.sort(personas, (persona1, persona2) -> Persona.compararPorEdad(persona1, persona2));

        // Este metodo referenciado es semanticamente lo mismo que lo de arriba.
        // El operador infiere los parametros, por los parametros formales de la expresion lambda definida
        Collections.sort(personas, Persona::compararPorEdad);
        System.out.println("Personas ordenadas por edad: ");
        personas.forEach(p -> System.out.println(p));

        // Hay 4 tipos de metodos referenciados
        // 1. Metodo referenciado a un metodo estatico. Es el visto en este ejercicio
        // 2. Referencia a un metodo de instancia de un objeto particular
        // 3. Referencia a un metodo de instancia de un objeto abitrario de un tipo particular
        // 4. Referencia a un constructor

        // Leccion 20 - Referenciado Instancia (Tipo 2)
        ProveedorComparaciones comparador = new ProveedorComparaciones();
        System.out.println(" ");
        System.out.println("Personas ordenadas por nombre: ");
        Collections.sort(personas, comparador::compararPorNombre);
        personas.forEach(System.out::println);

        // Leccion 21 - Referenciado Instancia de un objeto arbitrario (Tipo 3)
        Collections.sort(personas, Persona::compararPorEdad2);
    }

}