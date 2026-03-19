package com.estudos.stock_manager.service;

import com.estudos.stock_manager.dto.ProductDTO;
import com.estudos.stock_manager.model.Product;
import com.estudos.stock_manager.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public void save(ProductDTO data) {
        Product product = new Product(data);
        repository.save(product);
    }
}
