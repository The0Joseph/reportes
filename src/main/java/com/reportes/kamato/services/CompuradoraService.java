package com.reportes.kamato.services;


import com.reportes.kamato.models.Computadora;
import com.reportes.kamato.repositories.ComputadoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompuradoraService {

    @Autowired
    ComputadoraRepository computadoraRepository;

    public List<Computadora> getAll(){
        return (List<Computadora>) computadoraRepository.findAll();
    }
}
