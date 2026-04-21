package com.cristian.futbol_api.service.impl;

import com.cristian.futbol_api.model.Entrenador;
import com.cristian.futbol_api.repository.EntrenadorRepository;
import com.cristian.futbol_api.service.EntrenadorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorServiceImpl implements EntrenadorService {

    private final EntrenadorRepository repository;

    public EntrenadorServiceImpl(EntrenadorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Entrenador> listar() {
        return repository.findAll();
    }

    @Override
    public Entrenador guardar(Entrenador entrenador) {
        return repository.save(entrenador);
    }

    @Override
    public Entrenador obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}