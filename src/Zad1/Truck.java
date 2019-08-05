package Zad1;

public class Truck extends Car {
    public static final double AIRCONDITIONTRUCK = 1.6;
    public static final double WEIGHTCONSUMPTION = 0.5;

    private double weight;

    public Truck(String name, double tank, double avarageConsumption, boolean airCondition, double weight) {
        super(name, tank, avarageConsumption, airCondition);
        this.weight = weight;
    }

    public static double getAIRCONDITIONTRUCK() {
        return AIRCONDITIONTRUCK;
    }

    public static double getWEIGHTCONSUMPTION() {
        return WEIGHTCONSUMPTION;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double rangeCalculator() {
        double weightConsumption = (weight - weight%100)/100 * WEIGHTCONSUMPTION;
        double consumption = 0;
        if (super.isAirCondition()) {
            consumption = (getTank() / (getAvarageConsumption() + AIRCONDITIONTRUCK + weightConsumption)) * 100;
            return consumption;
        }else {
            consumption = getTank()/(getAvarageConsumption()+weightConsumption)*100;
            return consumption;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "waga zaladunku " + weight + " ";
    }


}
