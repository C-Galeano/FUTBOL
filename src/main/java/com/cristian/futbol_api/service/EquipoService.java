package com.cristian.futbol_api.service;

import com.cristian.futbol_api.model.Equipo;
import java.util.List;

public interface EquipoService {

    List<Equipo> listar();

    Equipo guardar(Equipo equipo);

    Equipo obtener(Long id);

    void eliminar(Long id);
}