import java.util.Scanner;

public class SimpletronInterpreter {
    public static void main(String[] args) {
        int[] memory = new int[100];
        int accumulator = 0;
        int instructionCounter = 0;
        boolean isHalted = false;

        // Instrucciones del programa
        memory[0] = +1007; // Lee el primer número del teclado
        memory[1] = +1008; // Lee el segundo número del teclado
        memory[2] = +2007; // Carga el primer número en el acumulador
        memory[3] = +3008; // Suma el segundo número al acumulador
        memory[4] = +2109; // Almacena el resultado en la ubicación de memoria 09
        memory[5] = +1109; // Imprime el número almacenado
        memory[6] = +4300; // Termina la ejecución

        // Leer los dos números del teclado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Almacenar los números en las ubicaciones de memoria 07 y 08
        memory[7] = num1;
        memory[8] = num2;

        // Ejecutar el programa
        while (!isHalted) {
            int currentInstruction = memory[instructionCounter];
            int opcode = currentInstruction / 100;
            int operand = currentInstruction % 100;

            switch (opcode) {
                case 10: // Leer número del teclado
                    System.out.print("Ingrese un número: ");
                    memory[operand] = scanner.nextInt();
                    break;
                case 20: // Cargar número en el acumulador
                    accumulator = memory[operand];
                    break;
                case 30: // Sumar número al acumulador
                    accumulator += memory[operand];
                    break;
                case 21: // Almacenar número en la memoria
                    memory[operand] = accumulator;
                    break;
                case 11: // Imprimir número
                    System.out.println("El resultado es: " + memory[operand]);
                    break;
                case 43: // Terminar la ejecución
                    isHalted = true;
                    break;
                default:
                    System.out.println("Error: Instrucción inválida");
                    isHalted = true;
                    break;
            }

            instructionCounter++;
        }

        // Cerrar el Scanner después de su uso
        scanner.close();
    }
}

