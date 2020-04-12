package com.vinickiy.petclinic.repositories;

import com.vinickiy.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
