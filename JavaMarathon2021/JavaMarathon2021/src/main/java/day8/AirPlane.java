package day8;

public class AirPlane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;


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

    public String toString() {
        return "Изготовитель: " + manufacturer + " год выпуска: " + year + " длина: " + length + " вес: "
                + weight;

    }

    public int getLength() {
        return length;
    }

    public static void compareAirplanes(AirPlane airPlane1, AirPlane airPlane2) {
        if (airPlane1.getLength() > airPlane2.getLength())
            System.out.println("Первый самолет длиннее");
        else if ((airPlane1.getLength() < airPlane2.getLength()))
            System.out.println("Второй самолет длинее");
    }

}