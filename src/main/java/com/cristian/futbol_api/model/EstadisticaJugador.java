package com.cristian.futbol_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "estadistica_jugador")
public class EstadisticaJugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estadistica")
    private Long idEstadistica;

    @ManyToOne
    @JoinColumn(name = "id_jugador")
    private Jugador jugador;

    @ManyToOne
    @JoinColumn(name = "id_partido")
    private Partido partido;

    private int minutosJugados;
    private int goles;
    private int asistencias;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
}