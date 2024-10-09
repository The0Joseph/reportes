package com.reportes.kamato.repositories;

import com.reportes.kamato.models.ComponenteEquipo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponenteEquipoRepository extends CrudRepository<ComponenteEquipo, Long> {

}
