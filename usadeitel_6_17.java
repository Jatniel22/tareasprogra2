import java.util.Scanner;

public class UsaDeitel_6_17 {
    public static void main(String[] args) {
        int numero;
        int par;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nEste programa recibe un entero e imprime si es par o no: ");
        System.out.println("\nPor favor introduzca un entero: ");
        numero = entrada.nextInt();

        par = Par(numero);

        System.out.printf((1 == par) ? "El numero %d es impar\n" : "El numero %d es par\n", numero);
    }

    public static int Par(int numero) {
        return numero % 2;
    }
}
