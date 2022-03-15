package SameInterface;

public class GasVehicle implements IVehicle{
    private final String name;

    GasVehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
