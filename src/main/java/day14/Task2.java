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
        }
    }

    public static List<String> parseFileToStringList(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        List<String> list = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String[] people = scanner.nextLine().split(" ");

            for (String str : people){
                list.add(str);
            }
            
            if (Integer.parseInt(people[1]) < 0) {
                throw new IllegalStateException("Некорректный входной файл");
            }
        }
        scanner.close();
        return list;
    }
}
