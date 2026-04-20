package com.cristian.futbol_api.repository;

import com.cristian.futbol_api.model.Entrenador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrenadorRepository extends JpaRepository<Entrenador, Long> {
}