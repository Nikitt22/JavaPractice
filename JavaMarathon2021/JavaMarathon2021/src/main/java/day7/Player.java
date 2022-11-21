package day7;

public class Player {
    private int stamina;
    public static int MAX_STAMINA = 100;
    public static int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if(countPlayers>6)
            countPlayers=6;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int run() {
        stamina--;
        if (stamina == MIN_STAMINA) {
            System.out.println("Игроку нужен отдых");
            countPlayers--;}
            return stamina;
         }
    public static void info() {
        int vacantPlace = 6 - countPlayers;
        if (countPlayers < 6)
            System.out.println("“Команды неполные. На поле еще есть " + vacantPlace + " свободных мест”");
        else if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");}
            else{
            System.out.println("На поле не может быть больше 6 игроков");}
        }

    }


