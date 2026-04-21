package com.cristian.futbol_api.service;

import com.cristian.futbol_api.model.Jugador;
import java.util.List;

public interface JugadorService {

    List<Jugador> listar();

    Jugador guardar(Jugador jugador);

    List<Jugador> porEquipo(Long idEquipo);

    List<Jugador> masDeXGoles(int goles);

    void eliminar(Long id);
}