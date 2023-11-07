import EjemploBasicoLambda.Operacion;
import EjemploBasicoLambda.Calculadora;
public class Ejemplo3 {
    public static void main(String[] args) {
        int numero1=2;
        int numero2=3;
        Calculadora calculadora = new Calculadora();
        int resultadoSuma = calculadora.aplicar(numero1,numero2,(a,b)->a + b);
        System.out.println(resultadoSuma);


    }
}
