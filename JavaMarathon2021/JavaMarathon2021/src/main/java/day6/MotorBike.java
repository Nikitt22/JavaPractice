package day6;

public class MotorBike {
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
    void info (){
        System.out.println("This is a motorbike");
    }
    int result=0;
   public int yearDifference(int inputYear){
        result = inputYear-year;
        System.out.println("Difference between years motorbike: " + Math.abs(result));
        return result;
    }
}

