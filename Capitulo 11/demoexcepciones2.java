import java.io.IOException;

// Definición de la clase ExcepcionA que hereda de Exception
class ExcepcionA extends Exception {
    public ExcepcionA(String message) {
        super(message);
    }
}

// Definición de la clase ExcepcionB que hereda de ExcepcionA
class ExcepcionB extends ExcepcionA {
    public ExcepcionB(String message) {
        super(message);
    }
}

public class DemoExcepciones {
    public static void main(String[] args) {
        try {
            // Lanzamos una excepción de tipo ExcepcionA
            throw new ExcepcionA("Esta es una excepción de tipo ExcepcionA");
        } catch (Exception excepcion) {
            System.out.println("Excepción capturada: " + excepcion.getMessage());
        }

        try {
            // Lanzamos una excepción de tipo ExcepcionB
            throw new ExcepcionB("Esta es una excepción de tipo ExcepcionB");
        } catch (Exception excepcion) {
            System.out.println("Excepción capturada: " + excepcion.getMessage());
        }

        try {
            // Lanzamos una NullPointerException (excepción de tiempo de ejecución)
            String str = null;
            str.length();
        } catch (Exception excepcion) {
            System.out.println("Excepción capturada: " + excepcion.getMessage());
        }

        try {
            // Lanzamos una IOException (excepción de E/S)
            throw new IOException("Esta es una excepción de tipo IOException");
        } catch (Exception excepcion) {
            System.out.println("Excepción capturada: " + excepcion.getMessage());
        }
    }
}
