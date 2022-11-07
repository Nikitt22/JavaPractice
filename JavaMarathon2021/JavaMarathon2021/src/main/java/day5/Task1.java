package day5;

public class Task1 {
    public static void main(String[] args) {
    Car car = new Car();
    car.setColor("Black");
    car.setModel("Volvo");
    car.setYear(2020);
    car.getColor();
    car.getModel();
    car.getYear();


    }
}
class Car{
    private String color;
    private String model;
    private  int year;

    public String getColor() {
        System.out.println(color);
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        System.out.println(model);
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        System.out.println(year);
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

