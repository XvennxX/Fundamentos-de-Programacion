import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double numero;
        double resultado;

        System.out.println("ingrese el numero que desea elevar al cuadrado");
        numero= lector.nextDouble();


        resultado = (numero*numero);

        System.out.println("la suma de los dos numero es:"+" "+resultado);

    }
}

