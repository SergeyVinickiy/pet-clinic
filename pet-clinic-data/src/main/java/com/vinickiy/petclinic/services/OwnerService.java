package com.vinickiy.petclinic.services;

import com.vinickiy.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);


}
