package com.reportes.kamato.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity

@Table(name = "Equipo")

@Getter
@Setter

public  class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String ip_local;
    private String ip_servidor;
    private String ip_principal;
    private String user;
    private String password;
    private Boolean state;
    private Boolean availability;    /*disponibilidad*/

    @ManyToOne
    @JoinColumn(name = "tipo_equipo_id")
    private TipoEquipo tipo_equipo;

    @ManyToOne
    @JoinColumn(name = "area_id")
    private Area area;

    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<ComponenteEquipo> componenteEquipos;

    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Laptop> laptops;

    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Computadora> computadoras;


}