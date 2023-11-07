import EjemploBasicoLambda.Saludo;
import EjemploBasicoLambda.SaludoSP;
public class Ejemplo2 {
    public static void main(String[] args) {

        Saludo saludo2 = (name -> "Hola " + name);
        System.out.println(saludo2.decirHola("Huguito Hongo"));

        //saludo sin parametros
        SaludoSP saludo = ()->"Salve";
        System.out.println(saludo.saludo());



    }
}
