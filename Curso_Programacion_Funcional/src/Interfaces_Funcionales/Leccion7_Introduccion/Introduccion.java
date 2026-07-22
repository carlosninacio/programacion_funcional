package Interfaces_Funcionales.Leccion7_Introduccion;

public class Introduccion {

    // Una interfaz funcional es una interfaz que tiene un solo metodo abstracto. Se pueden usar metodos por defecto
    // metodos estaticos y metodos heredados de la clase object y declarados como metodos abstractos

        @FunctionalInterface // Esta anotación es una buena practica. Pero si solo tiene un solo metodo abstracto
        // es una interfaz funcional sin tener que colocar la anotación
        public interface Comparator<T> {
            int compare(T o1, T o2);

            // Se puede declarar otro metodo abstracto SOLO si procede de la clase Object
            boolean equals(Object obj);
        }


}