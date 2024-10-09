package com.reportes.kamato.services;

import com.reportes.kamato.models.ModeloEquipo;
import com.reportes.kamato.repositories.ModeloEquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloEquipoService {

    @Autowired
    ModeloEquipoRepository modeloEquipoRepository;

    public List<ModeloEquipo> getAll(){
        return (List<ModeloEquipo>) modeloEquipoRepository.findAll();
    }

    public ModeloEquipo save( ModeloEquipo modeloEquipo){
        return modeloEquipoRepository.save(modeloEquipo);
    }
}
