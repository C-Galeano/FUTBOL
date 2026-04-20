package com.cristian.futbol_api.repository;

import com.cristian.futbol_api.model.Partido;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface PartidoRepository extends JpaRepository<Partido, Long> {

    @Query(value = """
        SELECT SUM(goles_local + goles_visita)
        FROM partido
        WHERE equipo_local = :idEquipo OR equipo_visita = :idEquipo
    """, nativeQuery = true)
    Integer totalGolesEquipo(@Param("idEquipo") Long idEquipo);

    @Query(value = """
        SELECT p.fecha, e1.nombre, e2.nombre, p.goles_local, p.goles_visita
        FROM partido p
        JOIN equipo e1 ON p.equipo_local = e1.id_equipo
        JOIN equipo e2 ON p.equipo_visita = e2.id_equipo
    """, nativeQuery = true)
    List<Object[]> resultadosPartidos();
}