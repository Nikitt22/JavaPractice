package day13;
public class Task1 {
    public static void main(String[] args) {
    User user1 = new User("Tom");
    User user2 = new User("Jerry");
    User user3 = new User("Donald");

    user1.sendMessage(user2,"Hi Jerry");
    user1.sendMessage(user2, "How you doing?");

    user2.sendMessage(user1, "Hello Tom!");
    user2.sendMessage(user1, "I,m Fine");
    user2.sendMessage(user1, "What's up?");

    user3.sendMessage(user1,"Hi pal");
    user3.sendMessage(user1,"Let's go to hangout?");
    user3.sendMessage(user1,"Sounds good!");

    user1.sendMessage(user3, "Hi Donald");
    user1.sendMessage(user3, "Of course, let's go!");
    user1.sendMessage(user3, "I have  no doubt");

    user3.sendMessage(user1, "Will come to me at 7:00 p.m.");

        MessageDatabase.showDialog(user1,user2);
        //System.out.println(MessageDatabase.baseMessage);
        //MessageDatabase.getMessages();

    }
}
