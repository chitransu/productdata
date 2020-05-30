package com.chits.springdata.product.repos;

import com.chits.springdata.product.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
