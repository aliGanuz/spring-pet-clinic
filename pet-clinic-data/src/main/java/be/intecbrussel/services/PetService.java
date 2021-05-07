package be.intecbrussel.services;

import be.intecbrussel.model.Owner;
import be.intecbrussel.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
