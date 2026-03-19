package com.estudos.stock_manager.service;

import com.estudos.stock_manager.dto.ProductRequestDTO;
import com.estudos.stock_manager.dto.ProductResponseDTO;
import com.estudos.stock_manager.mapper.ProductMapper;
import com.estudos.stock_manager.model.Product;
import com.estudos.stock_manager.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductResponseDTO save(ProductRequestDTO data) {
        Product productEntity = mapper.toEntity(data);
        Product productSaved = repository.save(productEntity);
        return mapper.toResponse(productSaved);
    }
}
