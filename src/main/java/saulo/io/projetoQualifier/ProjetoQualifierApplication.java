package saulo.io.projetoQualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjetoQualifierApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ProjetoQualifierApplication.class, args);

		VehicleCompnent component = (VehicleCompnent) context.getBean("vehicleCompnent");

		component.services();
	}

}
