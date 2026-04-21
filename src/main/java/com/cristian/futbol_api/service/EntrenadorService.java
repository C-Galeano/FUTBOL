package com.cristian.futbol_api.service;

import com.cristian.futbol_api.model.Entrenador;
import java.util.List;

public interface EntrenadorService {

    List<Entrenador> listar();

    Entrenador guardar(Entrenador entrenador);

    Entrenador obtener(Long id);

    void eliminar(Long id);
}