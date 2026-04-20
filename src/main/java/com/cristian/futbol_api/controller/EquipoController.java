package com.cristian.futbol_api.controller;

import com.cristian.futbol_api.model.Equipo;
import com.cristian.futbol_api.repository.EquipoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipos")
@CrossOrigin("*")
public class EquipoController {

    private final EquipoRepository repository;

    public EquipoController(EquipoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Equipo> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Equipo guardar(@RequestBody Equipo equipo) {
        return repository.save(equipo);
    }

    @GetMapping("/{id}")
    public Equipo obtener(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}