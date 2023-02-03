package com.adorno.pruebaclaseharnina2301;

import org.springframework.stereotype.Service;

@Service
public class SegundoService {

	public SegundoService(Cosa cosa) {
		super();
		cosa.dimeAlgo();
	}

	
}
