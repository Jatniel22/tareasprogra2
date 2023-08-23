public class Fecha {
    private int dia;
    private int mes;
    private int annio;

    public Fecha(int pMes, int pDia, int pAnnio) {
        if (pMes > 0 && pMes <= 12) {
            mes = pMes;
        }

        if (pDia > 0 && pDia <= 31) {
            dia = pDia;
        }

        if (pAnnio >= 1929 && pAnnio <= 2029) {
            annio = pAnnio;
        }
    }

    public void establecerMes(int pMes) {
        if (pMes > 0 && pMes <= 12) {
            mes = pMes;
        }
    }

    public int obtenerMes() {
        return mes;
    }

    public void establecerDia(int pDia) {
        if (pDia > 0 && pDia <= 31) {
            dia = pDia;
        }
    }

    public int obtenerDia() {
        return dia;
    }

    public void establecerAnnio(int pAnnio) {
        if (pAnnio >= 1929 && pAnnio <= 2029) {
            annio = pAnnio;
        }
    }

    public int obtenerAnnio() {
        return annio;
    }

    public void mostrarFecha() {
        System.out.println("\nFecha seleccionada:");
        System.out.printf("%02d / %02d / %04d%n", obtenerMes(), obtenerDia(), obtenerAnnio());
    }

    public static void main(String[] args) {
        // Crear una instancia de Fecha
        Fecha fecha = new Fecha(6, 7, 2023);

        // Mostrar la fecha
        fecha.mostrarFecha();
    }
}
