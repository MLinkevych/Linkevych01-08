package homework2;

public class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle() {
    }
    public void fly(){
        System.out.println("This vehicle can fly");
    }
    public void land(){
        System.out.println("This vehicle have to land");
    }
}
