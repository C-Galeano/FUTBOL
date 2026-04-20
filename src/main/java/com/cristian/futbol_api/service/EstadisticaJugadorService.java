package com.cristian.futbol_api.service;

import com.cristian.futbol_api.model.EstadisticaJugador;
import com.cristian.futbol_api.repository.EstadisticaJugadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadisticaJugadorService {

    private final EstadisticaJugadorRepository repository;

    public EstadisticaJugadorService(EstadisticaJugadorRepository repository) {
        this.repository = repository;
    }

    public List<EstadisticaJugador> listar() {
        return repository.findAll();
    }

    public EstadisticaJugador guardar(EstadisticaJugador estadistica) {
        return repository.save(estadistica);
    }

    public EstadisticaJugador obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}