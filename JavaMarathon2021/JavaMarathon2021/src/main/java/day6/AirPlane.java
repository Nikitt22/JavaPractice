package day6;

public class AirPlane {
    String manufacturer;
    public int year;
    public int length;
    public int weight;
    public int fuel;


    public AirPlane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + " год выпуска: " + year + " длина: " + length + " вес: "
                + weight + " количество топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        fuel += n;
    }


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}