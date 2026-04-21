package com.cristian.futbol_api.service;

import com.cristian.futbol_api.model.Partido;
import java.util.List;

public interface PartidoService {

    List<Partido> listar();

    Partido guardar(Partido partido);

    Partido obtener(Long id);

    void eliminar(Long id);

    Integer totalGoles(Long idEquipo);

    List<Object[]> resultados();
}