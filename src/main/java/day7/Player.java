package day7;

//2. Дворовый футбол.
//   Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player)
//   содержит следующие поля:

//   Поле “выносливость” (англ. stamina), разное для каждого экземпляра, инициализируется через конструктор.
//   Константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и
//   “минимальная выносливость” (англ. MIN_STAMINA) со значением 0, единые для всех экземпляров.
//   Статическое поле countPlayers, которое считает количество игроков на футбольном поле
//   (изначально их 0, выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
//   Геттеры для полей “выносливость” и “количество игроков”.

//и следующие методы:
//  run() - игрок бежит при вызове этого метода. Этот метод уменьшает выносливость игрока на 1
//  при однократном вызове. Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
//  info() -  выводит сообщение в зависимости от количества игроков на поле. Если игроков меньше 6,
//  то выводит сообщение: “Команды неполные. На поле еще есть ... свободных мест”, иначе:
//  “На поле нет свободных мест”. Грамматикой русского языка пренебречь, т.е. фраза
//  “еще есть 1 свободных мест” допустима.
//

public class Player {

    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            this.countPlayers++;
        }
    }

    public void run() {
        if (stamina == 0)
            return;

        stamina--;

        if (stamina == 0)
            countPlayers--;
    }

    public static void info() {

        if (countPlayers == 5) {
            System.out.println("Команды неполные. На поле есть еще " + (6 - countPlayers) + " свободное место");
        } else if (countPlayers > 1 && countPlayers < 5) {
            System.out.println("Команды неполные. На поле есть еще " + (6 - countPlayers) + " свободных места");

        } else if (countPlayers == 0)
            System.out.println("Команды неполные. На поле есть еще " + (6 - countPlayers) + " свободных мест");
        else
            System.out.println("На поле нет свободных мест");
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }


}
