package SameInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Machine {

    private final IVehicle vehicle;


    Machine(IVehicle value) {
        this.vehicle = value;
    }

    public String getVehicleName() {
        return vehicle.getName();
    }
}
