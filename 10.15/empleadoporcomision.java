// Fig. 10.7: EmpleadoPorComision.java
// La clase EmpleadoPorComision extiende a Empleado.

public class EmpleadoPorComision extends Empleado implements PorPagar {
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de comisión

    // constructor
    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
            double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) // valida
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");

        if (ventasBrutas < 0.0)
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");

        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    // establece el monto de ventas brutas
    public void establecerVentasBrutas(double ventasBrutas) {
        if (ventasBrutas < 0.0)
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");

        this.ventasBrutas = ventasBrutas;
    }

    // devuelve el monto de ventas brutas
    public double obtenerVentasBrutas() {
        return ventasBrutas;
    }

    // establece la tarifa de comisión
    public void establecerTarifaComision(double tarifaComision) {
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) // valida
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");

        this.tarifaComision = tarifaComision;
    }

    // devuelve la tarifa de comisión
    public double obtenerTarifaComision() {
        return tarifaComision;
    }

    // calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
    @Override
    public double ingresos() {
        return obtenerTarifaComision() * obtenerVentasBrutas();
    }

    // devuelve representación String de un objeto EmpleadoPorComision
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "empleado por comision", super.toString(),
                "ventas brutas", obtenerVentasBrutas(), "tarifa de comision", obtenerTarifaComision());
    }
    
     @Override
    public double obtenerMontoPago() {
        return ingresos();
    }
}
