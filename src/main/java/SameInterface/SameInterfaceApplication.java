package SameInterface;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SameInterfaceApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(VehicleConfig.class);
        var electroVehicle = context.getBean("electroVehicle",IVehicle.class);
        var gasVehicle = context.getBean("gasVehicle",IVehicle.class);
        System.out.println(electroVehicle.getName());
        System.out.println(gasVehicle.getName());
    }
}
