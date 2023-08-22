package saulo.io.projetoQualifier;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public String hello() {
		
		System.out.println("Entrei neste método");
		
		return "Olá Mundo";
	}
}
