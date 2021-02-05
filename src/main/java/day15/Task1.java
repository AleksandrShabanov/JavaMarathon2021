package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        File fileShoes = new File("src/main/resources/shoes.csv");
        findShoes(fileShoes);
    }

    public static void findShoes(File file) {

        File fileMissingShoes = new File("src/main/resources/missing_shoes.txt");

        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter(fileMissingShoes);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoes = line.split(";");

                if (Integer.parseInt(shoes[2]) == 0) {
                    pw.println(Arrays.toString(shoes));
                }
            }
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
