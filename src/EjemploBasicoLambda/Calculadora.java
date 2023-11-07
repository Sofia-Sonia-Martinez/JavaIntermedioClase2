package EjemploBasicoLambda;

public class Calculadora {
    public int aplicar(int unNumero, int otroNumero, Operacion operacion){
        return operacion.aplicar(unNumero,otroNumero);
    }
}
