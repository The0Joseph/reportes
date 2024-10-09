package com.reportes.kamato.repositories;

import com.reportes.kamato.models.Area;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AreaRepository extends CrudRepository<Area, Long> {
}
