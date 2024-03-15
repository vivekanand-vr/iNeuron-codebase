package com.getitdone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.getitdone.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
