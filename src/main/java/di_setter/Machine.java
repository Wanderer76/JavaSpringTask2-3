package di_setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Machine {

    private Vehicle vehicle;

    public String getVehicleName() {
        return vehicle.getName();
    }

    @Autowired
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

}
