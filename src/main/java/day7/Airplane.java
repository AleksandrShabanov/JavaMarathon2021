package day7;

//В классе Самолет реализовать статический метод compareAirplanes, который в качестве аргументов
// принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том,
// какой из самолетов длиннее.

public class Airplane {

    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public static void compareAirplanes(Airplane a, Airplane b) {
        if (a.length > b.length)
            System.out.println("Самолёт " + a.producer + " длиннее");
        else if (b.length > a.length)
            System.out.println("Самолёт " + b.producer + " длиннее");
        else
            System.out.println("Длины самолётов равны");
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year +
                ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        this.fuel += n;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}
