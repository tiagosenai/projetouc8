package br.com.senai.aula1907.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GrupoController {
	@GetMapping({"/grupo", "/"})
	public String listarGrupo(Model modelo) {
		modelo.addAttribute("grupo", servico.listaGrupo());
		return "grupo"; //mostrar a página grupo.html
	}
}
