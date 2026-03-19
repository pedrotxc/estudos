package com.estudos.stock_manager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProductRequestDTO(@NotBlank String name,
                                String barcode,
                                String category,
                                BigDecimal costPrice,
                                @NotNull BigDecimal salePrice,
                                Double currentStock,
                                Double minStock,
                                LocalDate expirationDate,
                                String unitOfMeasure) {
}
