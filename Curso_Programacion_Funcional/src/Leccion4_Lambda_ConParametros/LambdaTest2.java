package Leccion4_Lambda_ConParametros;

public class LambdaTest2 {
    public static void main(String[] args) {
        Operaciones op = (num1, num2) -> System.out.println(num1+num2) ;
        //op.imprimeSuma(15,30);

        LambdaTest2 obj = new LambdaTest2();
        obj.miMetodo(((num1, num2) -> System.out.println(num1+num2)), 25,30);
    }

    public void miMetodo(Operaciones op, int num1, int num2) {
        op.imprimeOperacion(num1,num2);
    }
}