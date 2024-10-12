package com.reportes.kamato.repositories;

import com.reportes.kamato.models.Computadora;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputadoraRepository extends CrudRepository<Computadora, Long> {
}
