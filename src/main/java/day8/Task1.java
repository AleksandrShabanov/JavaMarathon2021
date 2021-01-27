package day8;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        String string = "";
        StringBuilder sb = new StringBuilder();

        long start = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++){
            string = i + " ";
            System.out.print(string);
        }
        long finish = System.currentTimeMillis();
        long result = finish - start;

        long start1 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++){
            sb.append(i).append(" ");
        }
        long finish1 = System.currentTimeMillis();
        long result1 = finish1 - start1;

        System.out.println();
        System.out.println(sb.toString());


        System.out.println("Скорость работы String: " + result);
        System.out.println("Скорость работы StringBuilder: " + result1);




    }
}
