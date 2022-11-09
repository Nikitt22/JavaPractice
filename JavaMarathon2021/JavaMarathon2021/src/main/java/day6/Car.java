package day6;

public class Car {
    private String color;
    private String model;
    private int year;

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

    void info() {
        System.out.println("This is a car");
    }

    int result = 0;

    int yearDifference(int inputYear) {
        if (inputYear > year)
            result = inputYear - year;
        else if (year > inputYear)
            result = year - inputYear;
        else result = 0;
        System.out.println("Difference between years car: " + result);
        return result;

    }
}

