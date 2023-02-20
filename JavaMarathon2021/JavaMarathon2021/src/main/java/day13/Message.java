package day13;

import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private  String text;
    Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.date = new Date();
        this.text = text;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return  "FROM: " + this.sender +
                " TO: " + this.receiver +
                ", Текст сообщения '" + text + '\'' +
                " ON: " + date +
                '}';
    }
}
