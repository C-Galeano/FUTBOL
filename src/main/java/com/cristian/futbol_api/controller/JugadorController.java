package com.cristian.futbol_api.controller;

import com.cristian.futbol_api.model.Jugador;
import com.cristian.futbol_api.service.JugadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jugadores")
@CrossOrigin("*")
public class JugadorController {

    private final JugadorService service;

    public JugadorController(JugadorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Jugador> listar() {
        return service.listar();
    }

    @PostMapping
    public Jugador guardar(@RequestBody Jugador jugador) {
        return service.guardar(jugador);
    }

    @GetMapping("/{id}")
    public Jugador obtener(@PathVariable Long id) {
        return service.listar().stream()
                .filter(j -> j.getIdJugador().equals(id))
                .findFirst()
                .orElse(null);
    }

    @GetMapping("/equipo/{id}")
    public List<Jugador> porEquipo(@PathVariable Long id) {
        return service.porEquipo(id);
    }

    @GetMapping("/goles/{x}")
    public List<Jugador> masDeXGoles(@PathVariable int x) {
        return service.masDeXGoles(x);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}