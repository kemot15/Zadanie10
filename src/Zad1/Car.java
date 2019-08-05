package Zad1;

public class Car extends Vehicle{
    public static final double AIRCONDITIONCAR = 0.8;
    private boolean airCondition;

    public Car(String name, double tank, double avarageConsumption, boolean airCondition) {
        super(name, tank, avarageConsumption);
        this.airCondition = airCondition;
    }

    public static double getAIRCONDITIONCAR() {
        return AIRCONDITIONCAR;
    }

    public boolean isAirCondition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }

    @Override
    public String toString() {
        return super.toString() + "Klimatyzacja jest " + (airCondition?"włączona ":"wylaczona ");
    }

    @Override
    public double rangeCalculator() {
        if (airCondition) {
            return getTank()/(getAvarageConsumption()+AIRCONDITIONCAR)*100;
        }else {
            return super.rangeCalculator();
        }
    }
}
