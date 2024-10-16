package com.reportes.kamato.repositories;

import com.reportes.kamato.models.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends CrudRepository<Laptop, Long> {
}
