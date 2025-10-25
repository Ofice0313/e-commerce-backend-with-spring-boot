package com.caleb.e_commerce.repositories;

import com.caleb.e_commerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
