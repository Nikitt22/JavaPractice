package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    int mark;
    String markLetter;
    Random random = new Random();

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        mark = random.nextInt(5) + 2;
        if (mark == 2)
            markLetter = "Неудовлетворительно";
        else if (mark == 3)
            markLetter = "Удовлетворительно";
        else if (mark == 4)
            markLetter = "Хорошо";
        else if (mark == 5)
            markLetter = "Отлично";


    }

}

