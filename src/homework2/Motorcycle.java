package homework2;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Motorcycle() {
    }

    @Override
    public void drive() {
        System.out.printf("The motorcycle has max speed: %d", getMaxSpeed());
    }
}
