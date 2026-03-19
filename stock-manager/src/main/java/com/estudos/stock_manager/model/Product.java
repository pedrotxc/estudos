package com.estudos.stock_manager.model;

import com.estudos.stock_manager.dto.ProductDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Product {

    public Product(ProductDTO data) {
        this.name = data.name();
        this.barcode = data.barcode();
        this.category = data.category();
        this.costPrice = data.costPrice();
        this.salePrice = data.salePrice();
        this.currentStock = data.currentStock();
        this.minStock = data.minStock();
        this.expirationDate = data.expirationDate();
        this.unitOfMeasure = data.unitOfMeasure();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String barcode;
    private String category;
    private BigDecimal costPrice;
    private BigDecimal salePrice;
    private Double currentStock;
    private Double minStock;
    private LocalDate expirationDate;
    private String unitOfMeasure;

}
