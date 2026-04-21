package com.cristian.futbol_api.service.impl;

import com.cristian.futbol_api.model.Partido;
import com.cristian.futbol_api.repository.PartidoRepository;
import com.cristian.futbol_api.service.PartidoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoServiceImpl implements PartidoService {

    private final PartidoRepository repository;

    public PartidoServiceImpl(PartidoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Partido> listar() {
        return repository.findAll();
    }

    @Override
    public Partido guardar(Partido partido) {
        return repository.save(partido);
    }

    @Override
    public Partido obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Integer totalGoles(Long idEquipo) {
        return repository.totalGolesEquipo(idEquipo);
    }

    @Override
    public List<Object[]> resultados() {
        return repository.resultadosPartidos();
    }
}