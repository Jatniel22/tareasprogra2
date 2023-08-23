// Clase Factura
import java.util.Date; // Importa otras clases necesarias
public class Factura implements PorPagar {
    private String numeroPieza;
    private String descripcion;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcion, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    @Override
    public double obtenerMontoPago() {
        return getCantidad() * getPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return String.format("Factura:%nNúmero de pieza: %s%nDescripción: %s%nCantidad: %d%nPrecio por artículo: %.2f",
                getNumeroPieza(), getDescripcion(), getCantidad(), getPrecioPorArticulo());
    }
}