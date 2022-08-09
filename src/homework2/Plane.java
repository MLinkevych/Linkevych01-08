package homework2;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public Plane() {
    }

    @Override
    public void fly() {
        System.out.printf("This vehicle could flight to the max distance: %d", getMaxDistance());
    }

    @Override
    public void land() {
        System.out.println("This vehicle have to land before reaching the max distance");
    }
}
