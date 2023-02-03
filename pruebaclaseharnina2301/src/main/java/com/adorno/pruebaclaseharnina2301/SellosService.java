package com.adorno.pruebaclaseharnina2301;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellosService {

	
	public SellosService(Cosa cosa) {
		System.out.println("soy un servicio naciendo");
		cosa.dimeAlgo();
	}

	public String getAlgo() {
		return "Que quieres?";
	}
}
