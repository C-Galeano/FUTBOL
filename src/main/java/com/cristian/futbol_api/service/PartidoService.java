package com.cristian.futbol_api.service;

import com.cristian.futbol_api.model.Partido;
import com.cristian.futbol_api.repository.PartidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoService {

    private final PartidoRepository repository;

    public PartidoService(PartidoRepository repository) {
        this.repository = repository;
    }

    public List<Partido> listar() {
        return repository.findAll();
    }

    public Partido guardar(Partido partido) {
        return repository.save(partido);
    }

    public Partido obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    // 🔥 consulta
    public Integer totalGoles(Long idEquipo) {
        return repository.totalGolesEquipo(idEquipo);
    }

    // 🔥 consulta
    public List<Object[]> resultados() {
        return repository.resultadosPartidos();
    }
}