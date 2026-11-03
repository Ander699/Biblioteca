package com.biblioteca.biblioteca.negocio;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ServicioLibros {

    private final RepositorioLibros repositorio;

    public ServicioLibros(RepositorioLibros repositorio) {
        this.repositorio = repositorio;
    }

    public List<Libro> listar() {
        return repositorio.listar();
    }

    public Libro buscarPorId(Long id) {
        return repositorio.buscarPorId(id)
                .orElseThrow(() -> new NoSuchElementException("No existe el libro " + id));
    }
}
