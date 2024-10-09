package com.reportes.kamato.services;

import com.reportes.kamato.models.Programa;
import com.reportes.kamato.repositories.ProgramaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramaService {
    @Autowired
    ProgramaRepository programaRepository;

    public List<Programa> getAll(){
        return (List<Programa>) programaRepository.findAll();
    }

    public Programa save( Programa programa){
        return programaRepository.save(programa);
    }
}
