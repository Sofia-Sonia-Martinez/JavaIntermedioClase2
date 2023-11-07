import EjemploBasicoLambda.Sumador;
public class Main {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        Sumador suma =(a,b)-> a + b;
        int resultado = suma.sumar(x,y);
        System.out.println("La suma es " + resultado);

    }
}