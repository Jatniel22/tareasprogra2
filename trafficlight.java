public enum TrafficLight {
    RED(50),
    GREEN(40),
    YELLOW(5);

    private final int duration;

    TrafficLight(int durationSeconds) {
        duration = durationSeconds;
    }

    public int getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        System.out.println("Duración de la luz roja: " + TrafficLight.RED.getDuration());
        System.out.println("Duración de la luz verde: " + TrafficLight.GREEN.getDuration());
        System.out.println("Duración de la luz amarilla: " + TrafficLight.YELLOW.getDuration());
    }
}
