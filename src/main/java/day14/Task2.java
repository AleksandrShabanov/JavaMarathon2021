package day14;

import java.io.*;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");

        try {
            System.out.println(parseFileToStringList(file));
        } catch (IOException e) {
            System.out.println("Файл не найден");
        } catch (IllegalStateException e){
            System.out.println("Некорректный входной файл");
        }
    }

    public static List<String> parseFileToStringList(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        List<String> list = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            list.add(line);
            String[] people = line.split(" ");

            if (Integer.parseInt(people[1]) < 0) {
                throw new IllegalStateException();
            }
        }
        scanner.close();

        return list;
    }
}
