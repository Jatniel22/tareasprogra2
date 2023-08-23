public class EmpleadoAsalariado extends Empleado implements PorPagar {
    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ingresos() {
        return getSalarioSemanal();
    }

    @Override
    public double obtenerMontoPago() {
        return ingresos();
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalario semanal: $" + String.format("%.2f", getSalarioSemanal());
    }
}
