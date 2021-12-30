package com.myPetClinic.services;

import com.myPetClinic.model.Owner;
import com.myPetClinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}
