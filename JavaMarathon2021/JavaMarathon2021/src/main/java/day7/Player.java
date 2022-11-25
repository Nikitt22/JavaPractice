package day7;

public class Player {
    private int stamina;
    private static int MAX_STAMINA = 100;
    private static int MIN_STAMINA = 0;
    private static int countPlayers;

    Player(int stamina) {
        this.stamina = stamina;
          if(countPlayers<6)
              countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
             if (stamina == MIN_STAMINA){
            return;}
                 stamina--;
             if(stamina==0)
                 countPlayers--;
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


