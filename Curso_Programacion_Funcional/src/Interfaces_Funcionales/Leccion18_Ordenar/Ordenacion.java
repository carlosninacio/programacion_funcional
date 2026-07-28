package Interfaces_Funcionales.Leccion18_Ordenar;

import java.util.*;

public class Ordenacion {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Carlos", "Kare", "Oreo", "Sammy");

        System.out.println("Lista antes de ordenarse: " + nombres);
        Collections.sort(nombres);
        System.out.println("Lista después de ordenarse: " + nombres);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(3, "Kiwi"));
        personas.add(new Persona(1, "Carlos"));
        personas.add(new Persona(5, "Alberto"));
        personas.add(new Persona(2, "Karen"));
        personas.add(new Persona(4, "Oreo"));


        System.out.println("Lista de personas desordenada: " + personas);
        Collections.sort(personas);
        System.out.println("Lista de personas ordenadas por nombre: " + personas);

        //Collections.sort(personas, new OrdenarPersonaPorId());

//        Collections.sort(personas, new Comparator<Persona>() {
//            @Override
//            public int compare(Persona o1, Persona o2) {
//                return o1.getIdPersona() - o2.getIdPersona();
//            }
//        });

        Collections.sort(personas, (p1, p2) -> p1.getIdPersona() - p2.getIdPersona());

        System.out.println("Lista de personas ordenadas por Id: " + personas);
    }
}