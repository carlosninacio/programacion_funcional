package Intento2.Leccion4_Lambda_ConParametros;

public class LambdaTest2 {
    public static void main(String[] args) {
        Operaciones op = (num, num2) -> System.out.println(num + num2);
        op.imprimeOperacion(15, 30);

        LambdaTest2 objeto = new LambdaTest2();
        // op es la referencia que se envia como argumento, si no se manda eso no realiza la suma
        objeto.miMetodo(op,2,5);

        // Resta utilizando otro objeto como referencia
        Operaciones op2 = (num, num2) -> System.out.println(num - num2);
        objeto.miMetodo(op2,2,5);

        // Multiplicación con la implementación directamente en el llamado
        objeto.miMetodo(((num, num2) -> System.out.println(num * num2)),7,3);

        objeto.miMetodo(((num, num2) -> System.out.println("parametro1: " + num + "parametro2: " + num2)),8,5);
    }

    public void miMetodo (Operaciones op, int num1, int num2) {
        op.imprimeOperacion(num1,num2);
    }
}