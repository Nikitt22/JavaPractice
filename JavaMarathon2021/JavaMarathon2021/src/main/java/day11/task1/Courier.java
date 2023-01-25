package day11.task1;

public class Courier implements Worker {
    private int salary;
   private static final int TASK_SALARY = 100;
    private boolean isPayed;
    private Warehouse warehouse;


    public boolean getIsPayed() {
        return isPayed;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Courier: " +  "Заработная плата = " + salary +
                ", Был ли выплачен бонус: " + isPayed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        warehouse.incrementDeliveryOrders();
    }

    @Override
    public void bonus() {

        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока недоступен");
        return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        return;
        }
            salary += 50000;
            isPayed = true;
        }
    }

