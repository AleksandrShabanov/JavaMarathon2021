package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[100];
        int index = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++)
            num[i] = random.nextInt(10000);


        for (int j = 0; j < num.length - 2; j++) {
            int currentSum = 0;
            for (int k = j; k < j + 3; k++){
                currentSum += num[k];
                }
            if (currentSum > max) {
                max = currentSum;
                index = j;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}

