package com.vinickiy.petclinic.repositories;

import com.vinickiy.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
