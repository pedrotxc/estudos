package com.estudos.stock_manager.repository;

import com.estudos.stock_manager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
