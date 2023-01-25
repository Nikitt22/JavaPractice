package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Toyota");
        list.add("Nissan");
        list.add("Honda");
        list.add("Subaru");
        list.add("Audi");

        System.out.println(list);
        list.add(3,"BMW");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);



    }
}
