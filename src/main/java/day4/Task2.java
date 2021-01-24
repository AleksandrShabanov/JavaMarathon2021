package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int zero = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        for (int j : array) {
            if (j > max)
                max = j;

            if (j < min)
                min = j;

            if (j % 10 == 0) {
                zero++;
                sum = sum + j;
            }
        }

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Кол -во элементов массива, оканчивающихся на ноль: " + zero);
        System.out.println("Сумма элементов массива, оканчивающихся на ноль: " + sum);
    }
}
