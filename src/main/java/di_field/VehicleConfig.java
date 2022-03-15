package di_field;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("di_field")
public class VehicleConfig {

    @Bean
    public Vehicle vehicle(){
        return new Vehicle("vehicle_)");
    }

}