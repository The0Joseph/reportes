package com.reportes.kamato.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "TipoEquipo")

@Getter
@Setter

public class TipoEquipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "tipo_equipo", cascade = CascadeType.ALL)
    private List<Equipo> equipos;


}
