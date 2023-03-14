package day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String userName;
    List<User> subscriptions;

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public User(String userName) {
        this.userName = userName;
        this.subscriptions = new ArrayList<>();

    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }
        public boolean isFriend(User user) {
       return this.isSubscribed(user) && user.isSubscribed(this);
    }
    public void sendMessage(User user, String text){

        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return userName;
    }
}



