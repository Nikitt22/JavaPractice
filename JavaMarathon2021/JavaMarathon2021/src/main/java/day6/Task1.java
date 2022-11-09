package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        MotorBike motorBike = new MotorBike("Honda", "White",2050);
        car.info();
        motorBike.info();
        car.setYear(2020);
        car.yearDifference(2025);
        motorBike.yearDifference(2000);
    }
}
