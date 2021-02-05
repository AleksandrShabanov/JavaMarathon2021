package day14;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test2");

        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Неккоректный входной файл");
        }
    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int sum = 0;
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");

        if (numbers.length != 10) throw new IllegalArgumentException();

        for (int i = 0; i < numbers.length; i++){
            sum += Integer.parseInt(numbers[i]);
        }
        System.out.println(sum);
    }
}
