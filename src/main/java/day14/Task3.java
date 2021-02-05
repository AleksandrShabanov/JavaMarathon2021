package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        File file = new File("people");

        try {
            System.out.println(parseFileToObjList(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static List<Person> parseFileToObjList(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<Person> list = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String[] people = scanner.nextLine().split(" ");

            if (Integer.parseInt(people[1]) < 0) {
                throw new IllegalStateException("Некорректный входной файл");
            }

            list.add(new Person(people[0], Integer.parseInt(people[1])));
        }
        scanner.close();
        return list;
    }
}
