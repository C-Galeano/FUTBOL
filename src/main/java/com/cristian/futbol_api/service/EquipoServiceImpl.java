package com.cristian.futbol_api.service.impl;

import com.cristian.futbol_api.model.Equipo;
import com.cristian.futbol_api.repository.EquipoRepository;
import com.cristian.futbol_api.service.EquipoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoServiceImpl implements EquipoService {

    private final EquipoRepository repository;

    public EquipoServiceImpl(EquipoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Equipo> listar() {
        return repository.findAll();
    }

    @Override
    public Equipo guardar(Equipo equipo) {
        return repository.save(equipo);
    }

    @Override
    public Equipo obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}