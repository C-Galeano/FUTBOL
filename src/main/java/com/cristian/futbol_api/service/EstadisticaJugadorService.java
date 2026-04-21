package com.cristian.futbol_api.service;

import com.cristian.futbol_api.model.EstadisticaJugador;
import java.util.List;

public interface EstadisticaJugadorService {

    List<EstadisticaJugador> listar();

    EstadisticaJugador guardar(EstadisticaJugador estadistica);

    EstadisticaJugador obtener(Long id);

    void eliminar(Long id);
}