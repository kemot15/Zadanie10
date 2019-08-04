package Zad1;

public class Truck extends Car {
    private double weight;

    public Truck(String name, double tank, double avarageConsumption, boolean airCondition, double weight) {
        super(name, tank, avarageConsumption, airCondition);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
