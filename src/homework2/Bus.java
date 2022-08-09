package homework2;

public class Bus extends GroundVehicle{
    private String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Bus() {
    }

    @Override
    public void drive() {
        System.out.printf("The bus rides en route: %s", getRoute());
    }
}
