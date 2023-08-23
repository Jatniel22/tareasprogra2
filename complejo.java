public class Complejo {
    private double parteReal;
    private double parteImaginaria;

    // Constructor con argumentos
    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    // Constructor sin argumentos (valores predeterminados)
    public Complejo() {
        this.parteReal = 0.0;
        this.parteImaginaria = 0.0;
    }

    // Método para sumar dos números complejos
    public Complejo sumar(Complejo otro) {
        double sumaReal = this.parteReal + otro.parteReal;
        double sumaImaginaria = this.parteImaginaria + otro.parteImaginaria;
        return new Complejo(sumaReal, sumaImaginaria);
    }

    // Método para restar dos números complejos
    public Complejo restar(Complejo otro) {
        double restaReal = this.parteReal - otro.parteReal;
        double restaImaginaria = this.parteImaginaria - otro.parteImaginaria;
        return new Complejo(restaReal, restaImaginaria);
    }

    // Método para imprimir el número complejo en la forma (parteReal, parteImaginaria)
    public void imprimir() {
        System.out.println("(" + parteReal + ", " + parteImaginaria + ")");
    }

    // Método getter para obtener la parte real del número complejo
    public double getParteReal() {
        return parteReal;
    }

    // Método getter para obtener la parte imaginaria del número complejo
    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public static void main(String[] args) {
        Complejo num1 = new Complejo(2.5, 3.7);
        Complejo num2 = new Complejo(1.2, -4.3);

        Complejo suma = num1.sumar(num2);
        Complejo resta = num1.restar(num2);

        System.out.print("Suma: ");
        suma.imprimir();

        System.out.print("Resta: ");
        resta.imprimir();
    }
}
