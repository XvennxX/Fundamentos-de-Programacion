import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double numero1;
        double numero2;
        double resultado;

        System.out.println("A continuación vamos a sumar dos numeros");

        System.out.println("ingrese un numero");
        numero1= lector.nextDouble();

        System.out.println("ingrese otro numero");
        numero2= lector.nextDouble();

        resultado = (numero1 + numero2);

        System.out.println("la suma de los dos numero es:"+" "+resultado);

    }
}
