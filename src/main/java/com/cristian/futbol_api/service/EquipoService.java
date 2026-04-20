package com.cristian.futbol_api.service;

import com.cristian.futbol_api.model.Equipo;
import com.cristian.futbol_api.repository.EquipoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {

    private final EquipoRepository repository;

    public EquipoService(EquipoRepository repository) {
        this.repository = repository;
    }

    public List<Equipo> listar() {
        return repository.findAll();
    }

    public Equipo guardar(Equipo equipo) {
        return repository.save(equipo);
    }

    public Equipo obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}