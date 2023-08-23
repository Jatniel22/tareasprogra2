import java.util.Scanner;

public class grande {
    private static final int MEM_SIZE = 100;
    private static final int READ_OP = 10;
    private static final int WRITE_OP = 11;
    private static final int STORE_OP = 21;
    private static final int SUB_OP = 31;
    private static final int JUMP_OP = 40;
    private static final int HALT_OP = 43;

    private int[] memory;
    private int accumulator;
    private int instructionCounter;
    private int instructionRegister;
    private int operationCode;
    private int operand;
    private boolean running;

    public grande() {
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
            case SUB_OP:
                accumulator -= memory[operand];
                break;
            case JUMP_OP:
                instructionCounter = operand;
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
        grande simulator = new grande();
        int[] program = new int[100];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a procesar: ");
        int count = scanner.nextInt();
        program[0] = READ_OP * 100 + count;
        program[1] = STORE_OP * 100 + 1;

        for (int i = 1; i <= count; i++) {
            program[i + 1] = READ_OP * 100 + i + 1;
            program[i + 2] = SUB_OP * 100 + 1;
            program[i + 3] = JUMP_OP * 100 + (i + 1);
        }

        program[count + 4] = HALT_OP * 100;
        program[count + 5] = 0;

        simulator.loadProgram(program);
        simulator.run();

        int maxNumber = simulator.memory[2];
        for (int i = 3; i <= count + 1; i++) {
            if (simulator.memory[i] > maxNumber) {
                maxNumber = simulator.memory[i];
            }
        }

        System.out.println("El número más grande es: " + maxNumber);
    }
}
