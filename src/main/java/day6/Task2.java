package day6;

//        Создать новый объект класса Самолет с произвольными данными.
//        Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp(int n) два раза,
//        передав разные значения. Вызвать метод info().

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("S7", 2010, 38, 146000);

        airplane.setYear(2012);
        airplane.setLength(35);

        airplane.fillUp(2000);
        airplane.fillUp(1500);

        airplane.info();


    }
}
