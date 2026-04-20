public class Teoria {
    public static void main(String[] args) {

        // Sintaxis de una expresión Lambda
        // parametros -> cuerpo
        // Una función lambda representa el metodo abstracto de una interfaz funcional (solo puede tener 1)

        //     Ficticia f = () -> System.out.println("Hola Mundo")

        Ficticia f = (valor, valor2) -> {
            System.out.println("Hola Mundo" + valor + valor2);
        };

    }

    public interface Ficticia {
        public void aceptar(int valor, int valor2);
    }

    Ficticia f = new Ficticia() {
        @Override
        public void aceptar(int valor, int valor2) {
            // Cuerpo del método implementado aceptar
            System.out.println("Hola Mundo");
        }
    };
}