public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }

    public Fraccion sumar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador + otra.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion restar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador - otra.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion multiplicar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.numerador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public Fraccion dividir(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador;
        int nuevoDenominador = this.denominador * otra.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

    public String toString() {
        return numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        // Se crean 4 fracciones
        Fraccion f1 = new Fraccion(1, 4); // Fracción 1/4
        Fraccion f2 = new Fraccion(1, 2); // Fracción 1/2
        Fraccion f3 = new Fraccion(); // Fracción 0/1
        Fraccion f4 = new Fraccion(4); // Fracción 4/1
        // operaciones aritméticas con esas fracciones
        Fraccion suma = f1.sumar(f2);
        Fraccion resta = f1.restar(f3);
        Fraccion producto = f1.multiplicar(f4);
        Fraccion cociente = f1.dividir(f2);
        // mostrar resultados
        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println(f1 + " * " + f4 + " = " + producto);
        System.out.println(f1 + " / " + f2 + " = " + cociente);
    }
}
