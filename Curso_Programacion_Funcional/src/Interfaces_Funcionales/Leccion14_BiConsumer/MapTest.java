package Interfaces_Funcionales.Leccion14_BiConsumer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        String[][] arreglo = {{"Chris", "USA"}, {"Raju","India"}, {"Lynda", "Canada"}};

        // Crear mapa usando el array
        for(int i = 0; i < arreglo.length; i++) {
            map.put(arreglo[i][0], arreglo[i][1]);
        }
        System.out.println("Forma tradicional de imprimir KV de un mapa");
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        if (iter != null) {
            while (iter.hasNext()) {
                Map.Entry<String, String> entry = iter.next();
                System.out.println("Clave: " + entry.getKey() + "\t" + " Valor: " + entry.getValue());
            }
        }
        System.out.println("\nUsando BiConsumer y expresiones Lambda:");
        map.forEach((key,value) -> {
            System.out.println("Clave: " + key + "\t" + " Valor: " + value);
        });
    }
}