package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("test");

        printResult(file);
    }

    public static void printResult(File file){

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            double sum = 0;
            for (String str : numbers){
                sum += Double.parseDouble(str);
            }

            String result = String.format("%.3f", sum/7);
            System.out.println(sum/7 + " --> " + result);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

