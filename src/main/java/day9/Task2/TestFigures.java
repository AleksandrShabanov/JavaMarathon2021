package day9.Task2;

// В этом классе, в методе main() должны быть созданы и помещены в массив следующие
// геометрические фигуры:

//         Figure[] figures = {
//         new Triangle(10, 10, 10, "Red"),
//         new Triangle(10, 20, 30, "Green"),
//         new Triangle(10, 20, 15, "Red"),
//         new Rectangle(5, 10, "Red"),
//         new Rectangle(40, 15, "Orange"),
//         new Circle(4, "Red"),
//         new Circle(10, "Red"),
//         new Circle(5, "Blue")
//         };
//
// В этом же классе реализуйте два метода:
// public static double calculateRedPerimeter(Figure[] figures)
// public static double calculateRedArea(Figure[] figures)
//
// Первый метод, принимая на вход массив геометрических фигур, должен вернуть сумму периметров
// красных фигур. Второй метод, принимая на вход массив геометрических фигур, должен вернуть
// сумму площадей красных фигур.

// Вызовите эти два метода на массиве figures и выведите результат в консоль.


import java.awt.*;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(figures[2].area());


    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double result = 0;
        for (int i = 0; i < figures.length; i++){
            if (figures[i].getColor().equals("Red")){
                result += figures[i].perimeter();
            }
        }
        return result;
    }

    public static double calculateRedArea(Figure[] figures){
        double result = 0;
        for (int i = 0; i < figures.length; i++){
            if (figures[i].getColor().equals("Red")){
                result += figures[i].area();
            }
        }

        return result;
    }
}
