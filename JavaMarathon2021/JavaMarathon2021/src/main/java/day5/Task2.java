package day5;


public class Task2 {
    public static void main(String[] args) {
    MotorBike motorBike = new MotorBike("Honda", "red",2010);
        System.out.println(motorBike.getModel());
        System.out.println(motorBike.getColor());
        System.out.println(motorBike.getYear());

    }
}
class MotorBike{
    private String model;
    private String color;
    private int year;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public MotorBike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;

    }
}