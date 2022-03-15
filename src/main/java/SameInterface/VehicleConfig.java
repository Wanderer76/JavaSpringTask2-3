package SameInterface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("SameInterface")
public class VehicleConfig {

    @Bean(name = "gasVehicle")
    public IVehicle gasVehicle() {
        return new GasVehicle("GasVehicle_)");
    }

    @Bean(name="electroVehicle")
    public IVehicle electroVehicle() {
        return new ElectroVehicle("ElectroVehicle_)");
    }

    @Bean(name = "gasMachine")
    public Machine gasMachine() {
        return new Machine(new GasVehicle("GasVehicle_)"));
    }

    @Bean(name="electroMachine")
    public Machine electroMachine() {
        return new Machine(new ElectroVehicle("ElectroVehicle_)"));
    }


}