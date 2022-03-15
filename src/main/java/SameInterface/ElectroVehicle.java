package SameInterface;

public class ElectroVehicle implements IVehicle {
    private final String name;

    ElectroVehicle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
