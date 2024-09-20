package org.kalakec.phoneshop.service;

import org.kalakec.phoneshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
