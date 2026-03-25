package com.estudos.stock_manager.controller;

import com.estudos.stock_manager.dto.ProductRequestDTO;
import com.estudos.stock_manager.dto.ProductResponseDTO;
import com.estudos.stock_manager.service.ProductService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("v1/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ResponseEntity<ProductResponseDTO> save(@RequestBody @Valid ProductRequestDTO data, UriComponentsBuilder uriBuilder) {
        ProductResponseDTO response = service.save(data);
        URI uri = uriBuilder.path("/v1/products/{id}").buildAndExpand(response.id()).toUri();
        return ResponseEntity.created(uri).body(response);
    }

    @GetMapping
    public ResponseEntity<Page<ProductResponseDTO>> listProducts(@PageableDefault(size = 5, sort = "id") Pageable pageable) {
        return ResponseEntity.ok().body(service.listProducts(pageable));
    }
}
