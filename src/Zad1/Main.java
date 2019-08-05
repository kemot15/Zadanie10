package Zad1;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Vehicle("Mercedes", 50, 6);
        vehicles[1] = new Car("BMW", 70, 8.8, false);
        vehicles[2] = new Truck("Man", 250, 35, false, 1500);
        showInfo(vehicles);
    }


public static void showInfo (Vehicle[] cars){
    for (Vehicle car: cars){
        System.out.println(car.toString() + "zasieg " + car.rangeCalculator(car.getAvarageConsumption()));
    }
}
}