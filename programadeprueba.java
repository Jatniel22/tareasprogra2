public class ProgramaDePrueba {
    public static void main(String[] args) {
        // Crear un objeto EmpleadoPorHoras
        EmpleadoPorHoras empleado = new EmpleadoPorHoras("Jatniel", "Oliva", "2022-19-00248", 15.75, 40);

        // Mostrar la información del empleado
        System.out.println("Información del empleado:");
        System.out.println(empleado);

        // Calcular y mostrar los ingresos del empleado
        System.out.printf("Ingresos del empleado: $%.2f%n", empleado.ingresos());
    }
}