package com.reportes.kamato.repositories;

import com.reportes.kamato.models.Programa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface ProgramaRepository extends CrudRepository<Programa, Long> {

}
