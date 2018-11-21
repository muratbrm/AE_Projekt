package de.bs14.bestellprozess.interfaces;

import org.springframework.data.repository.CrudRepository;

import de.bs14.bestellprozess.entity.User;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}