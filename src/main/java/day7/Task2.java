package day7;

// В методе main() создать объект класса Random, который будет генерировать случайные числа.
// Создать 6 игроков, передавая им в качестве аргумента в конструктор случайно сгенерированные числа
// от 90 до 100. Вызвать метод info(). При попытке создать 7,8 … n игрока, количество игроков на поле
// меняться не должно, проверить это.

// Примените к одному игроку метод run(), пока он полностью не выдохнется
// (отрицательное значение выносливости не допускается). Вывести количество игроков на поле.


import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Player player1 = new Player((int) (Math.random() * ((100 - 90) + 1) + 90));
        Player player2 = new Player((int) (Math.random() * ((100 - 90) + 1) + 90));
        Player player3 = new Player((int) (Math.random() * ((100 - 90) + 1) + 90));
        Player player4 = new Player((int) (Math.random() * ((100 - 90) + 1) + 90));
        Player player5 = new Player((int) (Math.random() * ((100 - 90) + 1) + 90));
        Player player6 = new Player((int) (Math.random() * ((100 - 90) + 1) + 90));
        Player player7 = new Player((int) (Math.random() * ((100 - 90) + 1) + 90));

        for (int i = player1.getStamina(); i > 0; i--){
            player1.run();
        }

        player1.info();
        System.out.println(player1.getStamina());
        System.out.println(Player.getCountPlayers());


    }
}
