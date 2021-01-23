package day4;

// С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера
// и заполнить его случайными числами от 0 до 10. Затем вывести содержимое массива в консоль,
// а также вывести в консоль информацию о:
//        а) Длине массива
//        б) Количестве чисел больше 8
//        в) Количестве чисел равных 1
//        г) Количестве четных чисел
//        д) Количестве нечетных чисел
//        е) Сумме всех элементов массива
//
//        Пример:
//        Введено число 10. Сгенерирован следующий массив:
//        [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
//
//        Информация о массиве:
//        Длина массива: 10
//        Количество чисел больше 8: 1
//        Количество чисел равных 1: 0
//        Количество четных чисел: 6
//        Количество нечетных чисел: 4
//        Сумма всех элементов массива: 46


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] num = new int[scanner.nextInt()];

        int moreThanEight = 0;
        int equalsOne = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10);

            if (num[i] > 8) {
                moreThanEight++;
            } else if (num[i] == 1) {
                equalsOne++;
            } else if (num[i] % 2 == 0) {
                even++;
            } else if (num[i] % 2 != 0) {
                odd++;
            }
        }

        for (int j : num) {
            sum = sum + j;
        }

        System.out.println(Arrays.toString(num));
        System.out.println("Информация о массиве: ");
        System.out.println();
        System.out.println("Длинна массива: " + num.length);
        System.out.println("Количество чисел больше 8: " + moreThanEight);
        System.out.println("Количество чисел равных 1: " + equalsOne);
        System.out.println("Количество чётных чисел: " + even);
        System.out.println("Количество нечётных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
