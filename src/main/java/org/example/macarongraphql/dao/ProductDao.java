package org.example.macarongraphql.dao;

import org.example.macarongraphql.ds.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductDao extends MongoRepository<Product, String> {
}
