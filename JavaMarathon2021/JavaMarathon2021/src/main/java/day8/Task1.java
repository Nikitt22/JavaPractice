package day8;

public class Task1 {
    public static void main(String[] args) {
      String string= "";
        StringBuilder sb = new StringBuilder();
//        long startTime = System.currentTimeMillis();
//    for(int i = 0; i<20000; i++)
//        string += i + " ";
//        System.out.println(string);
//       long stopTime = System.currentTimeMillis(); //сохраняем время после того, как код отработал
//        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));


        long startTime = System.currentTimeMillis();
        for(int i=0;i<20000;i++)
            sb.append(i).append(" ");
        System.out.println(sb);
        long stopTime = System.currentTimeMillis(); //сохраняем время после того, как код отработал
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
    }

}
