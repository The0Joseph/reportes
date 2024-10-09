package com.reportes.kamato.models;

import jakarta.persistence.*;


@Entity

@Table(name = "Procesador")

public class Procesador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float generation;
    private float speed;
}
