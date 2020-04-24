package com.vinickiy.petclinic.controllers;

import com.vinickiy.petclinic.model.Owner;
import com.vinickiy.petclinic.model.PetType;
import com.vinickiy.petclinic.services.OwnerService;
import com.vinickiy.petclinic.services.PetService;
import com.vinickiy.petclinic.services.PetTypeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class PetControllerTest {

    @Mock
    PetService petService;
    @Mock
    OwnerService ownerService;
    @Mock
    PetTypeService petTypeService;
    @InjectMocks
    PetController petController;

    MockMvc mockMvc;

    Owner owner;
    Set<PetType> petTypes;

    @BeforeEach
    void setUp() {
        owner = Owner.builder().id(1l).build();

        petTypes = new HashSet<>();
        petTypes.add(PetType.builder().id(1L).name("Dog").build());
        petTypes.add(PetType.builder().id(2L).name("Cat").build());

        mockMvc = MockMvcBuilders
                .standaloneSetup(petController)
                .build();

    }

    @Test
    void populatePetTypes() {


    }

    @Test
    void findOwner() {
    }

    @Test
    void initOwnerBinder() {
    }

    @Test
    void initCreationForm() {
    }

    @Test
    void processCreationForm() {
    }

    @Test
    void initUpdateForm() {
    }

    @Test
    void processUpdateForm() {
    }
}