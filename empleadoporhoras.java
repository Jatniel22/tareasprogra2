public class EmpleadoPorHoras extends Empleado {
    private double horas;
    private double sueldo;

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double sueldoPorHoras, double horasTrabajadas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        establecerSueldo(sueldoPorHoras);
        establecerHoras(horasTrabajadas);
    }

    public void establecerSueldo(double sueldoPorHoras) {
        sueldo = sueldoPorHoras >= 0 ? sueldoPorHoras : 0;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerHoras(double horasTrabajadas) {
        horas = (horasTrabajadas >= 0 && horasTrabajadas <= 168) ? horasTrabajadas : 0;
    }

    public double obtenerHoras() {
        return horas;
    }

    public double ingresos() {
        return sueldo * horas;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: $%.2f%n%s: %.2f",
                super.toString(), "Sueldo por hora", sueldo, "Horas trabajadas", horas);
    }
}