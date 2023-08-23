// Clase Empleado
// Empleado.java
import java.util.Date; // Importa otras clases necesarias


public abstract class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nNúmero de Seguro Social: %s", getPrimerNombre(), getApellidoPaterno(),
                getNumeroSeguroSocial());
    }

    public abstract double ingresos();
}
