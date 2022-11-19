package day7;

public class Player {
    private int stamina;
    public static int MAX_STAMINA = 100;
    public static int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    Player(int stamina) {
        countPlayers++;
       }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int run(int stamina) {
        stamina--;
        if (stamina == MIN_STAMINA)
            System.out.println("Игроку нужен отдых");
        return stamina;
    }

    public void info() {
        int vacantPlace = 6 - countPlayers;
        if (countPlayers < 6)
            System.out.println("“Команды неполные. На поле еще есть " + vacantPlace + " свободных мест”");
        else if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        }
    }
}
