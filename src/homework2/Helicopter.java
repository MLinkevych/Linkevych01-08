package homework2;

public class Helicopter extends FlyingVehicle{
    public int weight;
    public int maxHeight;

    public Helicopter() {
    }

    @Override
    public void fly() {
        System.out.printf("This vehicle would not fly, if the weight is more than: %d \n" +
                " or reaches max height: %d", weight, maxHeight);
    }

    @Override
    public void land() {
        System.out.println("This vehicle have to land if has low gas");
    }
}
