package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Anton");
        User user2 = new User("Alex");
        User user3 = new User("Nina");

//        MessageDatabase.addNewMessage(user1,user2,"Hi!");
//        MessageDatabase.addNewMessage(user1,user2,"How are you?");
//        MessageDatabase.addNewMessage(user2,user1,"Hello!");
//        MessageDatabase.addNewMessage(user2, user1,"I'm fine! Thank's");
//        MessageDatabase.addNewMessage(user3, user1,"Hi))");
//        MessageDatabase.addNewMessage(user3,user1,"I miss you!");
//        MessageDatabase.addNewMessage(user3,user1,"Let's go to the walk?");
//        MessageDatabase.addNewMessage(user1,user3,"Hi)");
//        MessageDatabase.addNewMessage(user1,user3,"I miss you too.");
//        MessageDatabase.addNewMessage(user1,user3,"Let's go)");
//        MessageDatabase.addNewMessage(user3,user1,"Yeeee!))");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как дела?");
        user2.sendMessage(user1, "Привет!");
        user2.sendMessage(user1, "Все ок! Спасибо.");
        user2.sendMessage(user1, "Как ты?");
        user3.sendMessage(user1, "Здорово!");
        user3.sendMessage(user1, "Тебя взломали!");
        user3.sendMessage(user1, "Поменяй пароль))");
        user1.sendMessage(user3, "Привет!");
        user1.sendMessage(user3, "Блин! Спасибо большое");
        user1.sendMessage(user3, "Сейчас поменяю.");
        user3.sendMessage(user1, "Не за что)");

        MessageDatabase.showDialog(user1, user3);
    }
}
