package di_constructor;

public class Vehicle {
    private final String name;

    Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
