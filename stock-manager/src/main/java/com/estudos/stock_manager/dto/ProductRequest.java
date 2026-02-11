package com.estudos.stock_manager.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProductRequest(String name,
                             String barcode,
                             String category,
                             BigDecimal costPrice,
                             BigDecimal salePrice,
                             Double currentStock,
                             Double minStock,
                             LocalDate expirationDate,
                             String unitOfMeasure) {
}
