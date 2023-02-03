package com.adorno.pruebaclaseharnina2301;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PrimeraController {
	private SellosService sellosService;

	public PrimeraController(SellosService sellosService) {
		super();
		System.out.println("soy un Controller naciendo");
		this.sellosService = sellosService;
		System.out.println(this.sellosService.getAlgo());
	}

}
