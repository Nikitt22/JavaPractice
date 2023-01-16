package day11.task1;


public class Picker implements Worker {
    private int salary;
   // private static final int TASK_SALARY = 80;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public boolean getIsPayed() {
        return isPayed;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Picker: " + "Заработная плата = " + salary +
                ", Был ли выплачен бонус: " + isPayed;
    }

      @Override
    public void doWork() {
        salary += 80;
        warehouse.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10_000){
            System.out.println("Бонус пока недоступен");
            return;
        }
        if(isPayed){
            System.out.println("Бонус уже был выплачен");
            return;
        }
            salary += 70000;
        isPayed = true;
    }

}

