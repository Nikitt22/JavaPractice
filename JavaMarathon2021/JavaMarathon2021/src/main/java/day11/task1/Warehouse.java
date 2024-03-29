package day11.task1;

public class Warehouse {
   private int countPickedOrders;
   private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void incrementPickedOrders(){
        countPickedOrders++;
    }
    public void incrementDeliveryOrders(){
        countDeliveredOrders++;
    }


    @Override
    public String toString() {
        return "Количество собранных заказов: " + countPickedOrders +
                " Количество выданных заказов: " + countDeliveredOrders;
    }
}
