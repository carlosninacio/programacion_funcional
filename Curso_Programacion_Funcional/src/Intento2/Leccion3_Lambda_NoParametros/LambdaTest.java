package Intento2.Leccion3_Lambda_NoParametros;

public class LambdaTest {
    public static void main(String[] args) {
        // Se indica falta de parametros con los parentesis vacios
        FunctionTest ft = () -> System.out.println("Hola Mundo");
        // La funcion lambda representa un objeto de una interfaz funcional
        ft.saludar();

        LambdaTest objeto = new LambdaTest();
        objeto.miMetodo(ft);
    }

    // Normalmente se va a usar como un argumento de un metodo
    public void miMetodo(FunctionTest parametro) {
        parametro.saludar();
    }
}