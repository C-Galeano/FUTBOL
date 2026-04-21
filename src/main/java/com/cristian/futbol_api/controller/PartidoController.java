package com.cristian.futbol_api.controller;

import com.cristian.futbol_api.model.Partido;
import com.cristian.futbol_api.service.PartidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidos")
@CrossOrigin("*")
public class PartidoController {

    private final PartidoService service;

    public PartidoController(PartidoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Partido> listar() {
        return service.listar();
    }

    @PostMapping
    public Partido guardar(@RequestBody Partido partido) {
        return service.guardar(partido);
    }

    @GetMapping("/{id}")
    public Partido obtener(@PathVariable Long id) {
        return service.obtener(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }

    // 🔥 consulta
    @GetMapping("/goles/{idEquipo}")
    public Integer totalGoles(@PathVariable Long idEquipo) {
        return service.totalGoles(idEquipo);
    }

    // 🔥 consulta
    @GetMapping("/resultados")
    public List<Object[]> resultados() {
        return service.resultados();
    }
}