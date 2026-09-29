package com.bibliboteca.ApiDeLivros.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bibliboteca.ApiDeLivros.model.Categoria;
import com.bibliboteca.ApiDeLivros.service.CategoriaSercive;

@RestController 
@RequestMapping ("/categorias")
public class CategoriaController {
    private final CategoriaSercive categoriaSercive;

    public CategoriaController(CategoriaSercive categoriaSercive){
        this.categoriaSercive = categoriaSercive;
    }

    @GetMapping()
     public List<Categoria> listaTodos(){
        return categoriaSercive.ListaTodos();
    }

    @GetMapping("/{id}")
    public Categoria buscaPorId(@PathVariable  Long id){
        return categoriaSercive.BuscaId(id);
    }    

    @PostMapping
    public Categoria Salvar(@RequestBody Categoria categoria){
        return categoriaSercive.Salvar(categoria);
    } 

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable  Long id){
         categoriaSercive.deletar(id);
    }
}
