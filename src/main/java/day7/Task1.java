package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Airbus", 2010,39,100_000);
        Airplane airplane2 = new Airplane("Boeing", 2011, 40, 100_000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}