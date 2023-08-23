public class Main {
    public static void metodoUno() throws Exception {
        try {
            int resultado = 10 / 0; // Generamos una excepción de división entre cero
        } catch (ArithmeticException e) {
            System.out.println("Excepción capturada en el métodoUno: " + e.getMessage());
            throw e; // Lanzamos nuevamente la excepción hacia el alcance externo
        }
    }

    public static void main(String[] args) {
        try {
            metodoUno(); // Llamamos al métodoUno desde el método principal
        } catch (Exception e) { // Capturamos la excepción del tipo Exception
            System.out.println("Excepción capturada en el método principal: " + e.getMessage());
        }
    }
}
