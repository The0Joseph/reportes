package com.reportes.kamato.services;

import com.reportes.kamato.models.ComponenteEquipo;
import com.reportes.kamato.repositories.ComponenteEquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponenteEquipoService {

    @Autowired
    ComponenteEquipoRepository componenteEquipoRepository;

    public List<ComponenteEquipo> getAll(){
        return (List<ComponenteEquipo>) componenteEquipoRepository.findAll();
    }
}
