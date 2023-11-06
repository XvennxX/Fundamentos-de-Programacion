import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double radio;
        double altura;
        double area ;
        double volumen;

        System.out.println("ingrese la medida del radio en cm");
        radio = lector.nextDouble();

        System.out.println("ingrese la medida de la altura en cm");
        altura = lector.nextDouble();



        area = ((2*3.1416*radio)*(radio+altura));
        volumen = ((3.1416*(radio*radio))*(altura));

        System.out.println("el area total del cilindro es:"+" "+area+" "+"cm^2");
        System.out.println("el volumen del cilindro es:"+" "+volumen+" "+"cm^3");

    }
}
