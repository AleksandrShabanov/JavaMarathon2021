package day13;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private List<User> subscriptions;

    public void subscribe(User user){
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        if (subscriptions.contains(user))
            return true;
        else
            return false;
    }

    public boolean isFriend(User user){
        return this.isSubscribed(user) && user.isSubscribed(this);

    }

    public void sendMessage(User user, String text){

        MessageDatabase.addNewMessage(this, user, text);
    }

    public User(String username){
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String toString() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
}
