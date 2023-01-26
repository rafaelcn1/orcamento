package br.com.orcamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResponsavelController {
	
	@GetMapping("responsavel")
	public String responsavel() {
		return "/paginas/responsavel";
	}

}
