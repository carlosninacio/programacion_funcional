package Interfaces_Funcionales.Leccion9_FunctionPart2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DatosComensales {

    public static void main(String[] args) {
        List<Comensal> listaComensales =
                Arrays.asList(new Comensal("Karen", 10.5, 5),
                        new Comensal("Carlos", 12, 5),
                        new Comensal("Samy", 145, 5),
                        new Comensal("Eva", 9, 5),
                        new Comensal("Lola", 11, 5),
                        new Comensal("Bonie", 19, 5),
                        new Comensal("Tony", 27, 5));

        List<Object> nombresComensales = getDatosComensales(listaComensales, x -> x.getNombre());
        System.out.println("Lista de los nombres de comensales es la siguiente: ");
        for (Object nombreComensal : nombresComensales) {
            System.out.println("El nombre es: " + nombreComensal);
        }

        List<Object> montosComensales = getDatosComensales(listaComensales, x -> x.getMonto_pedido());
        for (Object monto : montosComensales) {
            System.out.println("El monto es: " + monto);
        }
    }

    public static List<Object> getDatosComensales(List<Comensal> listaCom, Function<Comensal, Object> func) {
        // Esta lista guardará datos personalizados de los comensales
        List<Object> listaDatos = new ArrayList<>();
        // Iterar a través de la lista de comensales que recibimos
        for (Comensal comensal : listaCom) {
            listaDatos.add(func.apply(comensal));
        }
        return listaDatos;
    }
}