package day14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test2");

        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException io) {
            System.out.println("Неккоректный входной файл");
        }
    }

    public static void printSumDigits(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        List<String> string = Arrays.asList(line.split(" "));
        List<Integer> listNumbers = new ArrayList<>();

        scanner.close();
        int counter = 0;
        for (String numbers : string) {
            listNumbers.add(Integer.parseInt(numbers));
            counter++;
        }

        if (counter < 10 || counter > 10) throw new IOException();
        int sum = 0;
        for (int i : listNumbers) {
            sum += i;
        }

        System.out.println(sum);
    }
}
