package com.estudos.stock_manager.controller;

import com.estudos.stock_manager.dto.ProductRequest;
import com.estudos.stock_manager.mapper.ProductMapper;
import com.estudos.stock_manager.model.Product;
import com.estudos.stock_manager.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService service;
    private final ProductMapper mapper;

    @PostMapping
    public void createProduct(@RequestBody ProductRequest productRequest) {
        Product product = mapper.toModel(productRequest);
        service.createProduct(product);
    }
}
