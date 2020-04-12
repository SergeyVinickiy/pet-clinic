package com.vinickiy.petclinic.repositories;

import com.vinickiy.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
