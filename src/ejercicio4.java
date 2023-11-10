import java.util.Scanner;

public class ejercicio4{
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double euro;
        double resultado;

          System.out.println("A continuación convertiremos euros a dolares");

        System.out.println("ingrese el valor en Euros que desea convertir a Dolares");
        euro= lector.nextDouble();



        resultado = (euro * 1.07289);

        System.out.println(euro+"euros es igual a"+" "+resultado+" "+"dolares");

    }
}
