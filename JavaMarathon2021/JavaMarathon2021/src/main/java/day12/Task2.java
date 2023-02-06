package day12;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillingArray(0,30, list);
        fillingArray(300,350,list);
        System.out.println(list);

        }
        public static void fillingArray(int x, int y, List<Integer> list){
                for(int i = x; i<=y; i++)
                    if (i % 2 == 0)
                        list.add(i);
        }
    }

