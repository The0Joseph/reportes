package com.reportes.kamato.repositories;

import com.reportes.kamato.models.Equipo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EquipoRepository extends CrudRepository<Equipo, Long> {
}
