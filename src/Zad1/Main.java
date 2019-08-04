package Zad1;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Mercedes", 50, 6);
        System.out.println(vehicle1.rangeCalculator(vehicle1.getAvarageConsumption()));
        Vehicle vehicle2 = new Car("BMW", 70, 8.8, false);
        System.out.println(vehicle2.rangeCalculator(vehicle2.getAvarageConsumption()));
    }
}
