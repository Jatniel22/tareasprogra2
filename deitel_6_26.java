import java.util.Scanner;

public class Deitel_6_26 {
    public int Invierte(int numero) {
        int numeroInvertido = 0;
        while (numero != 0) {
            numeroInvertido = numeroInvertido * 10 + numero % 10;
            numero /= 10;
        }
        return numeroInvertido;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Deitel_6_26 miObjeto = new Deitel_6_26();

        System.out.println("Este programa recibe un entero y lo presenta con los dígitos invertidos.");
        System.out.println("Por favor introduzca un número: ");
        int numero = entrada.nextInt();

        int numeroInvertido = miObjeto.Invierte(numero);

        System.out.println("El número invertido es: " + numeroInvertido);
    }
}
