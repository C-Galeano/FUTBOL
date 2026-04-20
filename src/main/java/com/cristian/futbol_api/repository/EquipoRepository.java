package com.cristian.futbol_api.repository;

import com.cristian.futbol_api.model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {
}