package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    public static List<Message> baseMessage = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text) {
         baseMessage.add(new Message(sender, receiver, text));

    }

    public static List<Message> getMessages() {
        List<Message> messagePrint = new ArrayList<>();
        for (Message x : baseMessage) {
            messagePrint.add(x);
        }
        System.out.println(messagePrint);
        return messagePrint;
    }

    public static void showDialog(User u1, User u2) {
        for (Message x: baseMessage) {
            if (x.getSender() == u1 && x.getReceiver() == u2
                    ||
                    x.getSender() == u2 && x.getReceiver() == u1) {
                System.out.println(x.getSender() + ": " + x.getText());
            }
        }
    }
}
