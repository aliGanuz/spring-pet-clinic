package be.intecbrussel.services;

import be.intecbrussel.model.Pet;


public interface PetService extends CrudService<Pet, Long> {

    Pet findById(Long id);

}
