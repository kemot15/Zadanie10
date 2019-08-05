package Zad1;

public class Main {
    public static void main(String[] args) {
        Car[] vehicles = new Car[2];
       // vehicles[0] = new Vehicle("Mercedes", 50, 6);
        vehicles[0] = new Car("BMW", 70, 8.8, false);
        vehicles[1] = new Truck("Man", 250, 35, false, 1500);
        showInfo(vehicles);
        vehicles[0].setAirCondition(true);
        vehicles[1].setAirCondition(true);
        showInfo(vehicles);
    }


public static void showInfo (Car[] cars){
    for (Car car: cars){
        System.out.println(car.toString() + "zasieg " + car.rangeCalculator());
    }
}
}