package com.reportes.kamato.repositories;

import com.reportes.kamato.models.Procesador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProcesadorRepository extends CrudRepository<Procesador, Long> {

}
