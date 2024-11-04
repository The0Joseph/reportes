package com.reportes.kamato.services;

import com.reportes.kamato.models.TipoEquipo;
import com.reportes.kamato.repositories.TipoEquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TipoEquipoService {

    @Autowired
    TipoEquipoRepository tipoEquipoRepository;

    public List<TipoEquipo> getAll (){
        return (List<TipoEquipo>) tipoEquipoRepository.findAll();
    }


    public TipoEquipo save(TipoEquipo tipoEquipo){
        return tipoEquipoRepository.save(tipoEquipo);
    }


    public TipoEquipo getById(Long id) { return tipoEquipoRepository.findById(id).orElse(null); }


    public void deleteById(Long id) { tipoEquipoRepository.deleteById(id); }

}
