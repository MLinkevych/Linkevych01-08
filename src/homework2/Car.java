package homework2;

public class Car extends GroundVehicle{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car() {
    }

    @Override
    public void drive() {
        System.out.printf("The car model is %s", getModel());
    }
}
