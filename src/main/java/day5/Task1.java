package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();

        car.setModel("VW Golf 7");
        car.setYear(2012);
        car.setColor("blue");

        System.out.println("Модель автомобиля: " + car.getModel());
        System.out.println("Год выпуска: " + car.getYear());
        System.out.println("Цвет: " + car.getColor());
    }
}
