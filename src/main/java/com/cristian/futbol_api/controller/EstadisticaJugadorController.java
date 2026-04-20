package com.cristian.futbol_api.controller;

import com.cristian.futbol_api.model.EstadisticaJugador;
import com.cristian.futbol_api.repository.EstadisticaJugadorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estadisticas")
@CrossOrigin("*")
public class EstadisticaJugadorController {

    private final EstadisticaJugadorRepository repository;

    public EstadisticaJugadorController(EstadisticaJugadorRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<EstadisticaJugador> listar() {
        return repository.findAll();
    }

    @PostMapping
    public EstadisticaJugador guardar(@RequestBody EstadisticaJugador estadistica) {
        return repository.save(estadistica);
    }

    @GetMapping("/{id}")
    public EstadisticaJugador obtener(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}