import java.util.Scanner;

public class CalculadoraKilometraje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalKilometros = 0;
        int totalLitros = 0;

        System.out.println("Calculadora de Kilometraje de Gasolina");
        System.out.println("Ingrese los datos de cada viaje (kilómetros y litros).");
        System.out.println("Ingrese '-1' en kilómetros para salir.");

        int kilometros = obtenerKilometros(scanner);
        while (kilometros != -1) {
            int litros = obtenerLitros(scanner);

            double kilometrosPorLitro = calcularKilometrosPorLitro(kilometros, litros);
            mostrarResultado(kilometrosPorLitro);

            totalKilometros += kilometros;
            totalLitros += litros;

            double promedioKilometrosPorLitro = calcularPromedioKilometrosPorLitro(totalKilometros, totalLitros);
            mostrarPromedio(promedioKilometrosPorLitro);

            kilometros = obtenerKilometros(scanner);
        }

        System.out.println("¡Gracias por usar la Calculadora de Kilometraje de Gasolina!");
    }

    private static int obtenerKilometros(Scanner scanner) {
        System.out.print("Kilómetros recorridos en este viaje (-1 para salir): ");
        return scanner.nextInt();
    }

    private static int obtenerLitros(Scanner scanner) {
        System.out.print("Litros de gasolina utilizados: ");
        return scanner.nextInt();
    }

    private static double calcularKilometrosPorLitro(int kilometros, int litros) {
        return (double) kilometros / litros;
    }

    private static void mostrarResultado(double kilometrosPorLitro) {
        System.out.printf("Kilómetros por litro en este viaje: %.2f%n", kilometrosPorLitro);
    }

    private static double calcularPromedioKilometrosPorLitro(int totalKilometros, int totalLitros) {
        return (double) totalKilometros / totalLitros;
    }

    private static void mostrarPromedio(double promedioKilometrosPorLitro) {
        System.out.printf("Promedio de kilómetros por litro hasta ahora: %.2f%n", promedioKilometrosPorLitro);
        System.out.println();
    }
}
