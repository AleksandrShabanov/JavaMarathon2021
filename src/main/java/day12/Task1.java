package day12;
import java.util.ArrayList;
import java.util.List;

// Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
// Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка.
// Вывести список в консоль.

public class Task1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Audi");
        list.add("VW");
        list.add("Toyota");
        list.add("Mazda");
        list.add("Kia");

        for (String string : list)
            System.out.print(string + " ");

        list.add(3, "Lada");
        list.remove(0);
        System.out.println();

        for (String string : list)
            System.out.print(string + " ");
    }
}
