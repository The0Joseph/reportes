package com.reportes.kamato.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity

@Table(name = "ModeloEquipo")

@Getter
@Setter
public class ModeloEquipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "modelo_equipo", cascade = CascadeType.ALL)
    private List<ComponenteEquipo> componenteEquipos;

}
