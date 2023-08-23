import java.util.Scanner;

public class SimpletronSimulator {
    public static void main(String[] args) {
        int[] memory = new int[100]; // Memoria del Simpletron
        int accumulator = 0; // Registro acumulador
        int instructionCounter = 0; // Contador de instrucciones
        int operationCode = 0; // Código de operación (inicializado en 0)
        int operand = 0; // Operando (inicializado en 0)

        System.out.println("*** Bienvenido a Simpletron! ***");
        System.out.println("*** Por favor, introduzca en su programa una instrucción ***");
        System.out.println("*** (o palabra de datos) a la vez. Yo le mostrare ***");
        System.out.println("*** el numero de ubicacion y un signo de interrogacion (?) ***");
        System.out.println("*** Entonces usted escribira la palabra para esa ubicacion. ***");
        System.out.println("*** Teclee -9999 para dejar de introducir su programa. ***");

        Scanner scanner = new Scanner(System.in);

        // Carga del programa en memoria
        int userInput;
        do {
            System.out.print(String.format("%02d ?", instructionCounter));
            userInput = scanner.nextInt();
            memory[instructionCounter] = userInput;
            instructionCounter++;
        } while (userInput != -9999);

        System.out.println("*** Se completo la carga del programa ***");
        System.out.println("*** Empieza la ejecucion del programa ***");

        // Ejecución del programa
        instructionCounter = 0; // Reiniciar el contador de instrucciones

        while (memory[instructionCounter] != -99999) {
            int currentInstruction = memory[instructionCounter];
            operationCode = currentInstruction / 100;
            operand = currentInstruction % 100;

            switch (operationCode) {
                case 10: // Lee
                    System.out.print("Ingrese un número: ");
                    memory[operand] = scanner.nextInt();
                    break;
                case 11: // Escribe
                    System.out.println("Resultado: " + memory[operand]);
                    break;
                case 20: // Carga
                    accumulator = memory[operand];
                    break;
                case 21: // Almacena
                    memory[operand] = accumulator;
                    break;
                case 30: // Suma
                    accumulator += memory[operand];
                    break;
                case 40: // Resta
                    accumulator -= memory[operand];
                    break;
                case 50: // Divide
                    if (memory[operand] != 0) {
                        accumulator /= memory[operand];
                    } else {
                        System.out.println("Error: División por cero");
                        System.exit(1);
                    }
                    break;
                case 51: // Multiplica
                    accumulator *= memory[operand];
                    break;
                case 99: // Fin
                    System.out.println("*** Ejecución finalizada ***");
                    break;
                default:
                    System.out.println("Error: Código de operación inválido");
                    System.exit(1);
            }

            instructionCounter++;
        }

        // Vaciado de la computadora
        System.out.println("\n*** Vaciado de la computadora ***");
        System.out.println("*** Contenido de los registros ***");
        System.out.println("Acumulador: " + accumulator);
        System.out.println("Contador de instrucciones: " + instructionCounter);
        System.out.println("Código de operación: " + operationCode);
        System.out.println("Operando: " + operand);

        System.out.println("\n*** Contenido de la memoria ***");
        for (int i = 0; i < instructionCounter; i++) {
            System.out.printf("%02d: %d\n", i, memory[i]);
        }

        scanner.close();
    }
}
