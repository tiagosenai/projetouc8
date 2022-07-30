package br.com.senai.aula1907.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.aula1907.orm.Categoria;
import br.com.senai.aula1907.repository.CategoriaRepository;

@Service
public class CategoriaServicoCRUD implements CategoriaServico{
	
	@Autowired
	private CategoriaRepository repository;
	
	public List<Categoria> listarCategorias(){
		return (List<Categoria>) repository.findAll();
	}
	
	public void apagarCategoria(Integer id) {
		repository.deleteById(id);
	}
}
