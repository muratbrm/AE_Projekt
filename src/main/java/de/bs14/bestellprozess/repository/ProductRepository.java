package de.bs14.bestellprozess.repository;

import org.springframework.data.repository.CrudRepository;

import de.bs14.bestellprozess.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
