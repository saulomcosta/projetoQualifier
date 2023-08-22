package saulo.io.projetoQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleCompnent {

	@Autowired
	@Qualifier("carBean") // Aqui controla quem vai usar a services
	private Vehicle vehicle;

	public void services() {
		vehicle.start();
		vehicle.stop();
	}
}
