package Zad1;

public class Car extends Vehicle{
    private boolean airCondition;

    public Car(String name, double tank, double avarageConsumption, boolean airCondition) {
        super(name, tank, avarageConsumption);
        this.airCondition = airCondition;
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
    public double rangeCalculator(double consumption) {
        if (airCondition) {
            return super.rangeCalculator(consumption+getAIRCONDITIONCAR());
        }else {
            return super.rangeCalculator(consumption);
        }
    }
}
