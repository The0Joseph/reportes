package com.reportes.kamato.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Computadora")

@Getter
@Setter

public class Computadora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date_acquired;
    private String operating_system;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    @ManyToOne
    @JoinColumn(name = "procesador_id")
    private Procesador procesador;



}
