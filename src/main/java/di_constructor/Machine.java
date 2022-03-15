package di_constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Machine {

    private final Vehicle vehicle;

    @Autowired
    Machine(Vehicle value) {
        this.vehicle = value;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
