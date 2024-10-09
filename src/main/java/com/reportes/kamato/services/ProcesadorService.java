package com.reportes.kamato.services;

import com.reportes.kamato.models.Procesador;
import com.reportes.kamato.repositories.ProcesadorRepository;
import com.reportes.kamato.repositories.ProgramaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcesadorService {

    @Autowired
    ProcesadorRepository procesadorRepository;

    public List<Procesador> getAll(){
        return (List<Procesador>) procesadorRepository.findAll();
    }

    public Procesador save(Procesador procesador){
        return procesadorRepository.save(procesador);
    }
}
