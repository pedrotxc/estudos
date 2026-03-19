package com.estudos.stock_manager.controller;

import com.estudos.stock_manager.dto.ProductRequestDTO;
import com.estudos.stock_manager.dto.ProductResponseDTO;
import com.estudos.stock_manager.service.ProductService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<ProductResponseDTO> save(@RequestBody @Valid ProductRequestDTO data) {
        ProductResponseDTO response = service.save(data);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
