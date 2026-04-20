package com.cristian.futbol_api.repository;

import com.cristian.futbol_api.model.Jugador;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    @Query(value = "SELECT * FROM jugador WHERE id_equipo = :idEquipo", nativeQuery = true)
    List<Jugador> obtenerJugadoresPorEquipo(@Param("idEquipo") Long idEquipo);

    @Query(value = """
        SELECT j.* FROM jugador j
        JOIN estadistica_jugador e ON j.id_jugador = e.id_jugador
        GROUP BY j.id_jugador
        HAVING SUM(e.goles) > :goles
    """, nativeQuery = true)
    List<Jugador> jugadoresConMasDeXGoles(@Param("goles") int goles);
}