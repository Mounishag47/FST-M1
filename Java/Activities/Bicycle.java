package activities;

public class Bicycle implements BicycleParts, BicycleOperations {

    protected int gears;
    protected int currentSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }

    @Override
    public void speedUp(int increment) {
        currentSpeed += increment;
        if (currentSpeed > maxSpeed) {
            currentSpeed = maxSpeed;
        }
    }

    public String bicycleDesc() {
        return "No of gears are " + gears + "\nSpeed of bicycle is " + maxSpeed;
    }
}
