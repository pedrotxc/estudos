package com.estudos.stock_manager.controller;

import com.estudos.stock_manager.dto.ProductDTO;
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

    @PostMapping
    public void save(@RequestBody ProductDTO data) {
        service.save(data);
    }
}
