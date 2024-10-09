package com.reportes.kamato.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Laptop")

@Getter
@Setter

public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String color;
    private String number_serie;
    private String system_software;
    private LocalDate date_acquired;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;

    @ManyToOne
    @JoinColumn(name = "procesador_id")
    private Procesador procesador;

    @ManyToOne
    @JoinColumn(name = "marca_equipo_id")
    private MarcaEquipo marca_equipo;

    @ManyToOne
    @JoinColumn(name = "modelo_equipo_id")
    private ModeloEquipo modelo_equipo;

}
