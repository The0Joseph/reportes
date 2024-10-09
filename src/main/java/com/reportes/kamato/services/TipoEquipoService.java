package com.reportes.kamato.services;

import com.reportes.kamato.models.TipoEquipo;
import com.reportes.kamato.repositories.TipoEquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TipoEquipoService {

    @Autowired
    TipoEquipoRepository categoriaRepository;

    public List<TipoEquipo> getAll (){
        return (List<TipoEquipo>) categoriaRepository.findAll();
    }


    public TipoEquipo save(TipoEquipo categoria){
        return categoriaRepository.save(categoria);
    }

}
