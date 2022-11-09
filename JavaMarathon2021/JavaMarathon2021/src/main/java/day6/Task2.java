package day6;

public class Task2 {
    public static void main(String[] args) {
AirPlane airPlane = new AirPlane("Boing",2022,38,100000);
airPlane.setLength(35);
airPlane.setYear(2023);
airPlane.fillUp(50000);
airPlane.fillUp(10000);
airPlane.info();
    }

}
