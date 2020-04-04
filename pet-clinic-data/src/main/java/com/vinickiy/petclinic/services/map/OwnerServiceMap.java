package com.vinickiy.petclinic.services.map;

import com.vinickiy.petclinic.model.Owner;
import com.vinickiy.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;
import java.util.Set;


@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Long id, Owner object) {
        return super.save(id, object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
