package com.cristian.futbol_api.controller;

import com.cristian.futbol_api.model.Entrenador;
import com.cristian.futbol_api.service.EntrenadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrenadores")
@CrossOrigin("*")
public class EntrenadorController {

    private final EntrenadorService service;

    public EntrenadorController(EntrenadorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Entrenador> listar() {
        return service.listar();
    }

    @PostMapping
    public Entrenador guardar(@RequestBody Entrenador entrenador) {
        return service.guardar(entrenador);
    }

    @GetMapping("/{id}")
    public Entrenador obtener(@PathVariable Long id) {
        return service.obtener(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}