package com.cristian.futbol_api.service.impl;

import com.cristian.futbol_api.model.EstadisticaJugador;
import com.cristian.futbol_api.repository.EstadisticaJugadorRepository;
import com.cristian.futbol_api.service.EstadisticaJugadorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadisticaJugadorServiceImpl implements EstadisticaJugadorService {

    private final EstadisticaJugadorRepository repository;

    public EstadisticaJugadorServiceImpl(EstadisticaJugadorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<EstadisticaJugador> listar() {
        return repository.findAll();
    }

    @Override
    public EstadisticaJugador guardar(EstadisticaJugador estadistica) {
        return repository.save(estadistica);
    }

    @Override
    public EstadisticaJugador obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}