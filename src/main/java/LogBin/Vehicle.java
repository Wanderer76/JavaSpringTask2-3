package LogBin;

public class Vehicle {
    private final String name;

    Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void init() {
        System.out.println("initialization method!");
    }

    public void destroy() {
        System.out.println("Method of destruction!");
    }
}
