package com.reportes.kamato.repositories;

import com.reportes.kamato.models.ModeloEquipo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ModeloEquipoRepository extends CrudRepository<ModeloEquipo, Long> {
}