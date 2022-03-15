package di_constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("di_constructor")
public class VehicleConfig {

    @Bean
    public Vehicle vehicle(){
        return new Vehicle("vehicle_)");
    }

}
