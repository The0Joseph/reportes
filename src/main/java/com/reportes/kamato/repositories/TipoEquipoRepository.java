package com.reportes.kamato.repositories;

import com.reportes.kamato.models.TipoEquipo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TipoEquipoRepository extends CrudRepository<TipoEquipo, Long> {

}
