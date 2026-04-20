package com.cristian.futbol_api.controller;

import com.cristian.futbol_api.model.Entrenador;
import com.cristian.futbol_api.repository.EntrenadorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrenadores")
@CrossOrigin("*")
public class EntrenadorController {

    private final EntrenadorRepository repository;

    public EntrenadorController(EntrenadorRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Entrenador> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Entrenador guardar(@RequestBody Entrenador entrenador) {
        return repository.save(entrenador);
    }

    @GetMapping("/{id}")
    public Entrenador obtener(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}