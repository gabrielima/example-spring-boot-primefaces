package com.gabrielima.examplespringbootprimefaces.repositories;

import com.gabrielima.examplespringbootprimefaces.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
