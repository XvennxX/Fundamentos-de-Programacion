import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double numero1;
        double numero2;
        double numero3;
        double promedio;

        System.out.println("A continuación hallaremos la el pormedio de tres numeros");

        System.out.println("ingrese el primero numero");
        numero1 = lector.nextDouble();

        System.out.println("ingrese el segundo numero");
        numero2 = lector.nextDouble();

        System.out.println("ingrese el tercer numero");
        numero3 = lector.nextDouble();


        promedio = ((numero1+numero2+numero3)/3);


        System.out.println("el promedio de los tres numeros es:"+" "+promedio);

    }
}
