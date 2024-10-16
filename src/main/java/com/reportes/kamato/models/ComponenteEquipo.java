package com.reportes.kamato.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "ComponenteEquipo")

@Getter
@Setter

public class ComponenteEquipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate date_acquired;

    @ManyToOne
    @JoinColumn(name = "marca_equipo_id")
    private MarcaEquipo marca_equipo;

    @ManyToOne
    @JoinColumn(name = "modelo_equipo_id")
    private ModeloEquipo modelo_equipo;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;
}
