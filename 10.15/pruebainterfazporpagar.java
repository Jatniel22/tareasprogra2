// PruebaInterfazPorPagar.java
import java.util.Arrays; // Importa la clase Arrays

public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] objetosPorPagar = new PorPagar[6];

        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
        objetosPorPagar[4] = new EmpleadoPorHoras("Juan", "Perez", "222-22-2222", 15.00, 30.0);
        objetosPorPagar[5] = new EmpleadoPorComision("Ana", "Gomez", "333-33-3333", 5000.00, 0.05);

        System.out.println("Objetos PorPagar procesados en forma polimórfica:");

        for (PorPagar porPagarActual : objetosPorPagar) {
            System.out.println(porPagarActual); // Imprime la representación de cadena del objeto

            if (porPagarActual instanceof EmpleadoBaseMasComision) {
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) porPagarActual;
                empleado.establecerSalarioBase(empleado.obtenerSalarioBase() * 1.10); // Aumenta el salario base en un 10%
            }

            System.out.printf("Monto del pago: $%.2f%n", porPagarActual.obtenerMontoPago());
        }
    }
}
