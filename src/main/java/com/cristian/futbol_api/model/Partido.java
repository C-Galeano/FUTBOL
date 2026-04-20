package com.cristian.futbol_api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "partido")
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_partido")
    private Long idPartido;

    private LocalDate fecha;
    private String estadio;

    private Long equipoLocal;
    private Long equipoVisita;

    private int golesLocal;
    private int golesVisita;
}