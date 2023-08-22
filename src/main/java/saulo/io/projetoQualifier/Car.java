package saulo.io.projetoQualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("carBean")
public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Liga o Carro");
		
	}

	@Override
	public void stop() {
		System.out.println("Desliga o Carro");
		
	}

}
