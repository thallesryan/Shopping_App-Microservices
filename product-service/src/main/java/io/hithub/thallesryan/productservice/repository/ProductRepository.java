package io.hithub.thallesryan.productservice.repository;

import io.hithub.thallesryan.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}