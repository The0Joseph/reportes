package com.reportes.kamato.services;

import com.reportes.kamato.models.MarcaEquipo;
import com.reportes.kamato.repositories.MarcaEquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaEquipoService {

    @Autowired
    MarcaEquipoRepository marcaEquipoRepository;

    public List<MarcaEquipo> getAll(){
        return (List<MarcaEquipo>) marcaEquipoRepository.findAll();
    }

    public MarcaEquipo save( MarcaEquipo marcaEquipo){
        return marcaEquipoRepository.save(marcaEquipo);
    }

}
