import java.util.Scanner;

public class UsaFibonacci {
    public static void main(String args[]) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        Fibonacci miObjeto = new Fibonacci();
        System.out.println("\nEste programa calcula números de Fibonacci.");
        do {
            System.out.println("¿Qué número de Fibonacci desea?");
            System.out.println("\nEl número debe ser positivo.");
            numero = entrada.nextInt();
        } while (numero <= 0);

        if (numero == 1)
            System.out.printf("\nEl número de Fibonacci %d es %d\n", numero, 0);
        else if (numero == 2)
            System.out.printf("\nEl número de Fibonacci %d es %d\n", numero, 1);
        else
            System.out.printf("\nEl número de Fibonacci %d es %d\n", numero, miObjeto.Principal(numero));
    }
}
