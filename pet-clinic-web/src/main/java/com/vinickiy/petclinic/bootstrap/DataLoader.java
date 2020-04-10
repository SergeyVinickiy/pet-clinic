package com.vinickiy.petclinic.bootstrap;

import com.vinickiy.petclinic.model.Owner;
import com.vinickiy.petclinic.model.Pet;
import com.vinickiy.petclinic.model.PetType;
import com.vinickiy.petclinic.model.Vet;
import com.vinickiy.petclinic.services.OwnerService;
import com.vinickiy.petclinic.services.PetTypeService;
import com.vinickiy.petclinic.services.VetService;
import com.vinickiy.petclinic.services.map.OwnerServiceMap;
import com.vinickiy.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {

        PetType dog =  new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat =  new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAdress("278 kvartal");
        owner1.setCity("Kremenchug");
        owner1.setTelephone("1234456");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(saveDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Ricki");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner1.setAdress("Zhabotinski");
        owner1.setCity("Baku");
        owner1.setTelephone("1234558456");

        Pet fionasCat = new Pet();
        fionasCat.setPetType(saveCatPetType);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setName("Kitty");
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);
        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }


}
