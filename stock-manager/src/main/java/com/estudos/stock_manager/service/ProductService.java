package com.estudos.stock_manager.service;

import com.estudos.stock_manager.dto.ProductRequestDTO;
import com.estudos.stock_manager.dto.ProductResponseDTO;
import com.estudos.stock_manager.mapper.ProductMapper;
import com.estudos.stock_manager.model.Product;
import com.estudos.stock_manager.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductResponseDTO save(ProductRequestDTO data) {
        Product productSaved = repository.save(mapper.toEntity(data));
        return mapper.toResponse(productSaved);
    }

    public Page<ProductResponseDTO> listProducts(Pageable pageable) {
        return repository.findAll(pageable).map(mapper::toResponse);
    }
}
