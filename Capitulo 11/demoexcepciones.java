// Definición de la superclase ExcepcionA
class ExcepcionA extends Exception {
    public ExcepcionA(String message) {
        super(message);
    }
}

// Definición de la subclase ExcepcionB que hereda de ExcepcionA
class ExcepcionB extends ExcepcionA {
    public ExcepcionB(String message) {
        super(message);
    }
}

// Definición de la subclase ExcepcionC que hereda de ExcepcionB
class ExcepcionC extends ExcepcionB {
    public ExcepcionC(String message) {
        super(message);
    }
}

// Clase para demostrar el manejo de excepciones
public class DemoExcepciones {
    public static void main(String[] args) {
        try {
            // Lanzamos una excepción de tipo ExcepcionB
            throw new ExcepcionB("Esta es una excepción de tipo ExcepcionB");
        } catch (ExcepcionA e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        try {
            // Lanzamos una excepción de tipo ExcepcionC
            throw new ExcepcionC("Esta es una excepción de tipo ExcepcionC");
        } catch (ExcepcionA e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
