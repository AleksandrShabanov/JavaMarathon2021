package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(2012, "blue", "Golf7");
        Motorbike motorbike = new Motorbike(1990, "red", "Honda");

        car.info();
        motorbike.info();
        System.out.println(car.yearDifference(2011));
        System.out.println(motorbike.yearDifference(1989));
    }
}
