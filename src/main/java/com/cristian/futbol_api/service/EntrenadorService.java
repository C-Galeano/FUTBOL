package com.cristian.futbol_api.service;

import com.cristian.futbol_api.model.Entrenador;
import com.cristian.futbol_api.repository.EntrenadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorService {

    private final EntrenadorRepository repository;

    public EntrenadorService(EntrenadorRepository repository) {
        this.repository = repository;
    }

    public List<Entrenador> listar() {
        return repository.findAll();
    }

    public Entrenador guardar(Entrenador entrenador) {
        return repository.save(entrenador);
    }

    public Entrenador obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}