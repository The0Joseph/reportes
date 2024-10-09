package com.reportes.kamato.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "MarcaEquipo")

@Getter
@Setter
public class MarcaEquipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "marca_equipo", cascade = CascadeType.ALL)
    private List<ComponenteEquipo> componenteEquipos;

    @OneToMany(mappedBy = "marca_equipo", cascade = CascadeType.ALL)
    private List<Laptop> laptops;
}
