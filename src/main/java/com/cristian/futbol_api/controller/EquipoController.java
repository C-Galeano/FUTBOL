package com.cristian.futbol_api.controller;

import com.cristian.futbol_api.model.Equipo;
import com.cristian.futbol_api.service.EquipoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipos")
@CrossOrigin("*")
public class EquipoController {

    private final EquipoService service;

    public EquipoController(EquipoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Equipo> listar() {
        return service.listar();
    }

    @PostMapping
    public Equipo guardar(@RequestBody Equipo equipo) {
        return service.guardar(equipo);
    }

    @GetMapping("/{id}")
    public Equipo obtener(@PathVariable Long id) {
        return service.obtener(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}