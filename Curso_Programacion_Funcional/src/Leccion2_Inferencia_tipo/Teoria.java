package Leccion2_Inferencia_tipo;
public class Teoria {
    public static void main(String[] args) {
        Function f = (parametro, parametro2) -> System.out.println(parametro);
        MiClase obj = new MiClase();
        obj.metodo((parametro, parametro2) -> System.out.println(parametro));
    }

    public interface Function {
        public void accept(int entero, String cadena);
    }



    public static class MiClase {
        public void metodo(Function parametro) {
            // Hace algo con el parametro
        }
    }

    // La interfaz funcional al tener un solo metodo abstracto, la inferencia de tipo siempre va a saber
    // a que metodo hace referencia, si hubiera mas de uno no sabría a cual hacer referencia
}