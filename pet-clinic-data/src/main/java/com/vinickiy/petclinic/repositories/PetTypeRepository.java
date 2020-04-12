package com.vinickiy.petclinic.repositories;

import com.vinickiy.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
