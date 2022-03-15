package LogBin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("LogBin")
public class VehicleConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Vehicle vehicle() {
        return new Vehicle("vehicle_)");
    }


}