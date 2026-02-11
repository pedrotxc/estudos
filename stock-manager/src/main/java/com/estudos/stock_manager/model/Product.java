package com.estudos.stock_manager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String barcode;
    private String category;
    private String costPrice;
    private String salePrice;
    private Double currentStock;
    private Double minStock;
    private LocalDate expirationDate;
    private String unitOfMeasure;

}
