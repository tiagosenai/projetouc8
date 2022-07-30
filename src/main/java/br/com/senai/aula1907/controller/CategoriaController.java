package br.com.senai.aula1907.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.senai.aula1907.servico.CategoriaServico;

@Controller
public class CategoriaController {
	
	@Autowired
	private CategoriaServico servico;
	
	@GetMapping({"/categoria", "/"})
	public String listarGrupo(Model modelo) {
		modelo.addAttribute("categoria", servico.listarCategorias());
		return "categoria"; //mostrar a página grupo.html
	}
	
	@GetMapping({"/categoria/{id}"})
	public String apagarCategoria(@PathVariable Integer id) {
		servico.apagarCategoria(id);
		return "redirect:/categoria"; //mostrar a página grupo.html
	}
}
