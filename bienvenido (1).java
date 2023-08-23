import java.util.Scanner;

public class bienvenido {
    private int[] memory;
    private int accumulator;
    private int instructionCounter;
    private int instructionRegister;
    private int operationCode;
    private int operand;
    private boolean running;

    public bienvenido() {
        memory = new int[100];
        accumulator = 0;
        instructionCounter = 0;
        instructionRegister = 0;
        operationCode = 0;
        operand = 0;
        running = true;
    }

    public void loadProgram(int[] program) {
        for (int i = 0; i < program.length; i++) {
            memory[i] = program[i];
        }
    }

    public void fetchInstruction() {
        instructionRegister = memory[instructionCounter];
        operationCode = instructionRegister / 100;
        operand = instructionRegister % 100;
    }

    public void executeInstruction() {
        switch (operationCode) {
            case 10: // LEE
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese un número: ");
                int value = scanner.nextInt();
                memory[operand] = value;
                break;
            case 11: // ESCRIBE
                System.out.println(memory[operand]);
                break;
            case 20: // CARGA
                accumulator = memory[operand];
                break;
            case 21: // ALMACENA
                memory[operand] = accumulator;
                break;
            case 30: // SUMA
                accumulator += memory[operand];
                break;
            case 31: // RESTA
                accumulator -= memory[operand];
                break;
            case 32: // DIVIDE
                if (memory[operand] != 0) {
                    accumulator /= memory[operand];
                } else {
                    System.out.println("Error: División por cero");
                    running = false;
                }
                break;
            case 33: // MULTIPLICA
                accumulator *= memory[operand];
                break;
            case 40: // BIFURCA
                instructionCounter = operand;
                return;
            case 41: // BIFURCANEG
                if (accumulator < 0) {
                    instructionCounter = operand;
                    return;
                }
                break;
            case 42: // BIFURCACERO
                if (accumulator == 0) {
                    instructionCounter = operand;
                    return;
                }
                break;
            case 43: // ALTO
                running = false;
                break;
            default:
                System.out.println("Error: Código de operación inválido");
                running = false;
                break;
        }

        instructionCounter++;
    }

    public void run() {
        while (running) {
            fetchInstruction();
            executeInstruction();
        }
    }

    public static void main(String[] args) {
        int[] program = {1007, 1008, 2007, 3008, 2109, 1109, 4300};
        bienvenido simpletron = new bienvenido();
        simpletron.loadProgram(program);
        simpletron.run();
    }
}
