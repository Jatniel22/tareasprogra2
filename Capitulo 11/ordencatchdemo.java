public class OrdenCatchDemo {
    public static void main(String[] args) {
        try {
            // Lanzamos una excepción de tipo ExcepcionB
            throw new ExcepcionB("Esta es una excepción de tipo ExcepcionB");
        } catch (ExcepcionB e) {
            System.out.println("Excepción capturada por ExcepcionB: " + e.getMessage());
        } catch (ExcepcionA e) {
            System.out.println("Excepción capturada por ExcepcionA: " + e.getMessage());
        }
    }
}

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
