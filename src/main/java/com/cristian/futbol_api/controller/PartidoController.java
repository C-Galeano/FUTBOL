package com.cristian.futbol_api.controller;

import com.cristian.futbol_api.model.Partido;
import com.cristian.futbol_api.repository.PartidoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidos")
@CrossOrigin("*")
public class PartidoController {

    private final PartidoRepository repository;

    public PartidoController(PartidoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Partido> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Partido guardar(@RequestBody Partido partido) {
        return repository.save(partido);
    }

    @GetMapping("/{id}")
    public Partido obtener(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }

    // 🔥 CONSULTA: total goles por equipo
    @GetMapping("/goles/{idEquipo}")
    public Integer totalGoles(@PathVariable Long idEquipo) {
        return repository.totalGolesEquipo(idEquipo);
    }

    // 🔥 CONSULTA: resultados partidos
    @GetMapping("/resultados")
    public List<Object[]> resultados() {
        return repository.resultadosPartidos();
    }
}