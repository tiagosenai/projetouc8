package br.com.senai.aula1907.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.aula1907.orm.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer>{

}
