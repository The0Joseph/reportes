package com.reportes.kamato.services;

import com.reportes.kamato.models.Equipo;
import com.reportes.kamato.repositories.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {

    @Autowired
    EquipoRepository equipoRepository;

    public List<Equipo> getAll(){
        return (List<Equipo>) equipoRepository.findAll();
    }
}
