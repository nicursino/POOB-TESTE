package org.fatec.TESTE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // annotation (orientação a aspecto) - etiqueta
public class PrimeiroController {
	
	
	@GetMapping("/")
	public String paginaInicial() {
		return "index";
	}

}
