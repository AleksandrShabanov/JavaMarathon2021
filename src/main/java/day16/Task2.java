package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Random random = new Random();

        try {
            PrintWriter pw1 = new PrintWriter(file1);
            PrintWriter pw2 = new PrintWriter(file2);

            for (int i = 0; i < 1000; i++) {
                pw1.print(random.nextInt(100) + " ");
            }
            pw1.close();

            Scanner scanner = new Scanner(file1);
            String line = scanner.nextLine();
            String[] numbersFile1 = line.split(" ");

            double sum = 0;
            for (int i = 0; i < numbersFile1.length; i++) {
                sum += Double.parseDouble(numbersFile1[i]);
                if (i % 20 == 0) {
                    pw2.print(sum / 20 + " ");
                    sum = 0;
                }
            }
            pw2.close();

        } catch (FileNotFoundException e) {
            System.out.println("Не получилось создать файл");
        }
        printResult(file2);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] sumOfNumbers = line.split(" ");

            double sum = 0;
            for (String str : sumOfNumbers) {
                sum += Double.parseDouble(str);
            }

            System.out.println((int) sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
