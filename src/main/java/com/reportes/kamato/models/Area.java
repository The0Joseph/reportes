package com.reportes.kamato.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity

@Table(name = "Area")

@Getter
@Setter
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
    private List<Equipo> equipos;


}
