package LogBin;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LogBinApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(VehicleConfig.class);
        var machine = context.getBean(Vehicle.class);
        System.out.println(machine.getName());
        context.close();
    }
}
