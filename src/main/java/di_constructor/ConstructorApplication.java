package di_constructor;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ConstructorApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(VehicleConfig.class);
        Machine machine = context.getBean(Machine.class);
        System.out.println(machine.getVehicle().getName());
    }
}
