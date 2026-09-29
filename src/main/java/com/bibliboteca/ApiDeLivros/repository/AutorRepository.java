package com.bibliboteca.ApiDeLivros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibliboteca.ApiDeLivros.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{

List<Autor> findByNome(String nome);
}
