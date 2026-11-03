package com.biblioteca.biblioteca.presentacion;

import com.biblioteca.biblioteca.negocio.Libro;
import com.biblioteca.biblioteca.negocio.ServicioLibros;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class ControladorLibros {

    private final ServicioLibros servicio;

    public ControladorLibros(ServicioLibros servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Libro> listar() {
        return servicio.listar();
    }

    @GetMapping("/{id}")
    public Libro buscarPorId(@PathVariable Long id) {
        return servicio.buscarPorId(id);
    }
}