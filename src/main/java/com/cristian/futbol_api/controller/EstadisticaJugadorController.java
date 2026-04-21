package com.cristian.futbol_api.controller;

import com.cristian.futbol_api.model.EstadisticaJugador;
import com.cristian.futbol_api.service.EstadisticaJugadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estadisticas")
@CrossOrigin("*")
public class EstadisticaJugadorController {

    private final EstadisticaJugadorService service;

    public EstadisticaJugadorController(EstadisticaJugadorService service) {
        this.service = service;
    }

    @GetMapping
    public List<EstadisticaJugador> listar() {
        return service.listar();
    }

    @PostMapping
    public EstadisticaJugador guardar(@RequestBody EstadisticaJugador estadistica) {
        return service.guardar(estadistica);
    }

    @GetMapping("/{id}")
    public EstadisticaJugador obtener(@PathVariable Long id) {
        return service.obtener(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}