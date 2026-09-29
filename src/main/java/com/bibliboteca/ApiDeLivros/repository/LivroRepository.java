package com.bibliboteca.ApiDeLivros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibliboteca.ApiDeLivros.model.Autor;
import com.bibliboteca.ApiDeLivros.model.Categoria;
import com.bibliboteca.ApiDeLivros.model.Livro;


public interface LivroRepository extends JpaRepository<Livro,Long> {
    List<Livro> findByTituloContainingIgnoreCase(String titulo);
    List<Livro> findByAutor(Long autorId);
    List<Livro> findByCategoria(Long categoriaId);
}


