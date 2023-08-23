public class Fibonacci {
    public int Principal(int numero) {
        if (numero <= 0) {
            return 0;
        } else if (numero == 1 || numero == 2) {
            return 1;
        } else {
            int a = 1;
            int b = 1;
            int resultado = 0;

            for (int i = 3; i <= numero; i++) {
                resultado = a + b;
                a = b;
                b = resultado;
            }

            return resultado;
        }
    }
}
