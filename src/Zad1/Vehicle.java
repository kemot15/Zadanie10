package Zad1;

public class Vehicle {
    public static final double AIRCONDITIONCAR = 0.8;
    public static final double AIRCONDITIONTRUCK = 1.6;
    public static final double WEIGHTCONSUMPTION = 0.5;

    private String name;
    private double tank;
    private double avarageConsumption;

    public Vehicle(String name, double tank, double avarageConsumption) {
        this.name = name;
        this.tank = tank;
        this.avarageConsumption = avarageConsumption;
    }

    public static double getAIRCONDITIONCAR() {
        return AIRCONDITIONCAR;
    }

    public static double getAIRCONDITIONTRUCK() {
        return AIRCONDITIONTRUCK;
    }

    public static double getWEIGHTCONSUMPTION() {
        return WEIGHTCONSUMPTION;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTank() {
        return tank;
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    public double getAvarageConsumption() {
        return avarageConsumption;
    }

    public void setAvarageConsumption(double avarageConsumption) {
        this.avarageConsumption = avarageConsumption;
    }

    @Override
    public String toString() {
        return  "Samochod " + name +
                ", pojemnosc baku " + tank +
                ", srednie spalanie " + avarageConsumption + " ";
    }

    public double rangeCalculator (double avarageConsumption){
        return tank/avarageConsumption*100;
    }
}
