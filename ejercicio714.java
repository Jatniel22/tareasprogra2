
import java.util.Scanner;

public class ejercicio714 {
  private static final int TAMANO_ARREGLO = 10;

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int[] arreglo = new int[TAMANO_ARREGLO];

    for (int i = 0; i < TAMANO_ARREGLO; i++) {
      System.out.printf("Por favor introduzca el número %d: ", i + 1);
      arreglo[i] = entrada.nextInt();
    }

    int producto = multiplica(arreglo);
    System.out.printf("El producto es %d\n", producto);
  }

  public static int multiplica(int[] arreglo) {
    int producto = 1;

    for (int j = 0; j < arreglo.length; j++) {
      producto *= arreglo[j];
    }

    return producto;
  }
}
