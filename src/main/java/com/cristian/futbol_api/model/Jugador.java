package com.cristian.futbol_api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "jugador")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jugador")
    private Long idJugador;

    private String nombre;
    private String posicion;
    private int dorsal;
    private LocalDate fechaNac;
    private String nacionalidad;

    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;
}