package com.bibliboteca.ApiDeLivros.service;

import java.nio.file.OpenOption;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import com.bibliboteca.ApiDeLivros.model.Categoria;
import com.bibliboteca.ApiDeLivros.repository.CategoriaRepository;

@Service 
public class CategoriaSercive {
    
    private final CategoriaRepository categoriaRepository;

    public CategoriaSercive(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }


    public List<Categoria> ListaTodos(){
        return categoriaRepository.findAll();
    }

    public Categoria Salvar(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public Categoria BuscaId(Long id){
        return categoriaRepository.getById(id);
    }

    public Optional<Categoria> categoria(Long id){
        Optional<Categoria> categoriaId = categoriaRepository.findById(id);
        return categoriaId;
    }


   public void deletar(Long id){
     categoriaRepository.deleteById(id);
   }
}
