package com.cristian.futbol_api.service;

import com.cristian.futbol_api.model.Jugador;
import com.cristian.futbol_api.repository.JugadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {

    private final JugadorRepository repository;

    public JugadorService(JugadorRepository repository) {
        this.repository = repository;
    }

    public List<Jugador> listar() {
        return repository.findAll();
    }

    public Jugador guardar(Jugador jugador) {
        return repository.save(jugador);
    }

    public List<Jugador> porEquipo(Long idEquipo) {
        return repository.obtenerJugadoresPorEquipo(idEquipo);
    }

    public List<Jugador> masDeXGoles(int goles) {
        return repository.jugadoresConMasDeXGoles(goles);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}