
import java.util.Scanner;

public class promedio {
    private static final int MEM_SIZE = 100; // Tamaño de la memoria
    private static final int READ_OP = 10;   // Código de operación para leer
    private static final int WRITE_OP = 11;  // Código de operación para escribir
    private static final int STORE_OP = 21;  // Código de operación para almacenar
    private static final int ADD_OP = 30;    // Código de operación para suma
    private static final int DIV_OP = 32;    // Código de operación para división
    private static final int HALT_OP = 43;   // Código de operación para detener

    private int[] memory;       // Memoria de Simpletron
    private int accumulator;    // Acumulador de Simpletron
    private int instructionCounter; // Contador de instrucciones
    private int instructionRegister; // Registro de instrucciones
    private int operationCode;   // Código de operación
    private int operand;        // Operando
    private boolean running;    // Indica si el programa está en ejecución

    public promedio() {
        memory = new int[MEM_SIZE];
        accumulator = 0;
        instructionCounter = 0;
        instructionRegister = 0;
        operationCode = 0;
        operand = 0;
        running = false;
    }

    public void loadProgram(int[] program) {
        for (int i = 0; i < program.length; i++) {
            memory[i] = program[i];
        }
    }

    public void run() {
        running = true;

        while (running) {
            fetchInstruction();
            executeInstruction();
        }
    }

    private void fetchInstruction() {
        instructionRegister = memory[instructionCounter];
        operationCode = instructionRegister / 100;
        operand = instructionRegister % 100;
        instructionCounter++;
    }

    private void executeInstruction() {
        switch (operationCode) {
            case READ_OP:
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese un número: ");
                int input = scanner.nextInt();
                memory[operand] = input;
                break;
            case WRITE_OP:
                System.out.println("Resultado: " + memory[operand]);
                break;
            case STORE_OP:
                memory[operand] = accumulator;
                break;
            case ADD_OP:
                accumulator += memory[operand];
                break;
            case DIV_OP:
                if (memory[operand] != 0) {
                    accumulator /= memory[operand];
                } else {
                    System.out.println("Error: División por cero.");
                    running = false;
                }
                break;
            case HALT_OP:
                running = false;
                System.out.println("Ejecución finalizada.");
                break;
            default:
                System.out.println("Error: Operación no válida.");
                running = false;
                break;
        }
    }

    public static void main(String[] args) {
        promedio simulator = new promedio();
        int[] program = new int[17]; // 17 instrucciones en total (7 lecturas + 1 suma + 1 división + 1 almacenamiento + 1 escritura + 1 detener)
        Scanner scanner = new Scanner(System.in);

        // Cargar el programa en la memoria de Simpletron
        for (int i = 0; i < 7; i++) {
            program[i] = READ_OP * 100 + i; // Código de operación de lectura (10) y operando i
        }
        program[7] = ADD_OP * 100 + 0;    // Código de operación de suma (30) y operando 0
        program[8] = DIV_OP * 100 + 0;    // Código de operación de división (32) y operando 0
        program[9] = STORE_OP * 100 + 8;  // Código de operación de almacenamiento (21) y operando 8
        program[10] = WRITE_OP * 100 + 8; // Código de operación de escritura (11) y operando 8
        program[11] = HALT_OP * 100;      // Código de operación de detener (43)

        simulator.loadProgram(program);
        simulator.run();
    }
}

