package com.bibliboteca.ApiDeLivros.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity 
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
 
    private Long id;
    private String titulo;

    @ManyToOne 
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @ManyToOne 
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    
    public Livro() {
    }

    public Livro(Long id, String titulo, Autor autor, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
}
