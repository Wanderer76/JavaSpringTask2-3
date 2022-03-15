package di_setter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("di_setter")
public class VehicleConfig {

    @Bean
    public Vehicle vehicle(){
        return new Vehicle("vehicle_)");
    }

}