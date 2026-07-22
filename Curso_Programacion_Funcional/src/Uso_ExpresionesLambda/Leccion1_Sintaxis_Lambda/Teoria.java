package Uso_ExpresionesLambda.Leccion1_Sintaxis_Lambda;

public class Teoria {

    // Sintaxis función lambda
    // parametros -> cuerpo
    // Representa el metodo abstracto de una interfaz funcional

    // Una interfaz funcional solo tiene un metodo abstracto. Puede tener cualquier cantidad
    // de metodos default o estaticos, pero solo uno abstracto que puede ser representado
    // con una función lambda

    // Creación de una interfaz funcional
    public interface Ficticia {
        public void aceptar(int valor, int valor2); // Metodo abstracto
    }

    // Crear objeto de interfaz normalmente

    Ficticia f = new Ficticia() {
        @Override
        public void aceptar(int valor, int valor2) {
            System.out.println("Hola mundo");
        }
    };

    Ficticia f2 =  (valor, valor2) -> {System.out.println("Hola Mundo " + valor);};

    /*

    Se puede omitir el return en casos como el siguiente:
    Ficticia f = (valor, valor2) -> valor / valor2

     */

}