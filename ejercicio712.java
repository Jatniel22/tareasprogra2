import java.util.Scanner;

public class ejercicio712 {
    enum Estado { SI, NO };

    private static final int TAMANO = 5;
    private int numero;
    private int numeros_recibidos = 0;
    Estado almacenar;
    Estado imprimir;
    int Arreglo[] = new int[TAMANO];

    public static void main(String[] args) {
        ejercicio712 ejercicio = new ejercicio712();
        ejercicio.Recibe();
    }

    public void Recibe() {
        Scanner entrada = new Scanner(System.in);

        for (int n = 0; n < TAMANO; n++) {
            numero = 0;
            while (numero < 10 || numero > 100) {
                System.out.println("\nPor favor introduzca un numero entre 10 y 100 inclusive\n");
                numero = entrada.nextInt();
            }

            Arreglo[n] = numero;
            numeros_recibidos++;
            Imprime();
        }
        System.out.println("\n");
    }

    public void Imprime() {
        System.out.printf("\nLos numeros recibidos: %d", numeros_recibidos);
        imprimir = Estado.SI;

        System.out.printf("\n%d", Arreglo[0]);

        for (int j = 1; j < numeros_recibidos; j++) {
            imprimir = Estado.SI;

            for (int k = 0; k < j; k++) {
                if (Arreglo[j] == Arreglo[k])
                    imprimir = Estado.NO;
            }

            if (imprimir == Estado.SI) {
                System.out.printf("\n%d", Arreglo[j]);
            }
        }
    }
}
