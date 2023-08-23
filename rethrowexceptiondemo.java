public class RethrowExceptionDemo {
    public static void main(String[] args) {
        try {
            unMetodo();
        } catch (Exception e) {
            System.out.println("Excepción capturada en main:");
            e.printStackTrace();
        }
    }

    // Método que lanza una excepción
    public static void unMetodo2() throws Exception {
        throw new Exception("Excepción lanzada desde unMetodo2");
    }

    // Método que llama a unMetodo2 y vuelve a lanzar la excepción
    public static void unMetodo() throws Exception {
        try {
            unMetodo2();
        } catch (Exception e) {
            System.out.println("Excepción capturada en unMetodo:");
            e.printStackTrace();
            throw e; // Vuelve a lanzar la excepción
        }
    }
}
