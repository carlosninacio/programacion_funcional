package Interfaces_Funcionales.Leccion9_FunctionPart2;

import java.util.function.Function;

public class DatosComensal {

    public static void main(String[] args) {
        Comensal com1 = new Comensal("Karen", 350.6, 5);
        String nombreCom = (String) getDatoComensal(com1, x -> x.getNombre());
        int mesaCom = (int) getDatoComensal(com1, x -> x.getMesa());

        System.out.println("El nombre del comensal es: " + nombreCom);
        System.out.println("El numero de mesa del comensal " + nombreCom + " es: " + mesaCom);
    }

    // La function "fun" va a recibir en su metodo apply parametros de tipo comensal y regresar objects
    public static Object getDatoComensal(Comensal com, Function<Comensal, Object> func) {
        return func.apply(com);
    }
}