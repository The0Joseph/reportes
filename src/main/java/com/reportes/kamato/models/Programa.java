package com.reportes.kamato.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity

@Table(name = "Programa")

@Getter
@Setter
public class Programa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float version;
    private LocalDate date_only;
}
