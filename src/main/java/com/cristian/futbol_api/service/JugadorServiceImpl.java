package com.cristian.futbol_api.service.impl;

import com.cristian.futbol_api.model.Jugador;
import com.cristian.futbol_api.repository.JugadorRepository;
import com.cristian.futbol_api.service.JugadorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorServiceImpl implements JugadorService {

    private final JugadorRepository repository;

    public JugadorServiceImpl(JugadorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Jugador> listar() {
        return repository.findAll();
    }

    @Override
    public Jugador guardar(Jugador jugador) {
        return repository.save(jugador);
    }

    @Override
    public List<Jugador> porEquipo(Long idEquipo) {
        return repository.obtenerJugadoresPorEquipo(idEquipo);
    }

    @Override
    public List<Jugador> masDeXGoles(int goles) {
        return repository.jugadoresConMasDeXGoles(goles);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}