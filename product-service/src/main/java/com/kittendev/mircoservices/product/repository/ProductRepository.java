package com.kittendev.mircoservices.product.repository;

import com.kittendev.mircoservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
