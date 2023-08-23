public class Empleado {
    // Variables de instancia
    private String nombre; // Nombre del empleado
    private String apellido; // Apellido del empleado
    private double salarioMensual; // Salario mensual del empleado

    // Constructor para inicializar las variables de instancia
    public Empleado(String pNombre, String pApellido, double pSalarioMensual) {
        // Asignación de los valores de los parámetros a las variables de instancia
        nombre = pNombre;
        apellido = pApellido;
        if (pSalarioMensual > 0.0) {
            salarioMensual = pSalarioMensual;
        }
    } // Fin del constructor

    // Métodos getters y setters...
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSalarioMensual() {
        return salarioMensual;
    }

    public double obtenerSalarioAnual() {
        return obtenerSalarioMensual() * 12;
    }

    public double obtenerAumento() {
        return obtenerSalarioAnual() * 1.10;
    }

    // Método que muestra un resumen de la información relativa al empleado
    public void mostrarResumen() {
        System.out.printf("\nNombre: %s", obtenerNombre());
        System.out.printf("\nApellido: %s", obtenerApellido());
        System.out.printf("\nSalario mensual: %.2f", obtenerSalarioMensual());
        System.out.printf("\nSalario anual sin incremento: %.2f", obtenerSalarioAnual());
        System.out.printf("\nSalario anual con incremento: %.2f", obtenerAumento());
    } // fin del método mostrarResumen

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Julio", "zuniga", 9800.0);
        empleado.mostrarResumen();
    }
}

