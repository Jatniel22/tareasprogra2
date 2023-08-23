class UnaClase {
    public UnaClase() throws Exception {
        // Simulamos una condición que provoca una falla en el constructor
        boolean hayError = true;

        if (hayError) {
            throw new Exception("Fallo en el constructor: Información adicional sobre el error.");
        }

        // Si no hay error, continúa la inicialización del objeto
        System.out.println("El constructor ha sido completado exitosamente.");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            UnaClase objeto = new UnaClase();
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
