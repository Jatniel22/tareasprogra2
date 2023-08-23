import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        double radio;
        double area;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nEste programa recibe el radio de un círculo e imprime el área.");

        System.out.println("\nPor favor introduzca el radio: ");
        radio = entrada.nextDouble();

        area = Area(radio);

        System.out.printf("\nEl área del círculo es: %.2f\n", area);
    }

    public static double Area(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
