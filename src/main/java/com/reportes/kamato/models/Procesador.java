package com.reportes.kamato.models;

import jakarta.persistence.*;

import java.util.List;


@Entity

@Table(name = "Procesador")

public class Procesador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float generation;
    private float speed;

    @OneToMany(mappedBy = "procesador", cascade = CascadeType.ALL)
    private List<Laptop> laptops;

    @OneToMany(mappedBy = "procesador", cascade = CascadeType.ALL)
    private List<Computadora> computadoras;

}
