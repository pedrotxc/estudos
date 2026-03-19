package com.estudos.stock_manager.dto;

import java.math.BigDecimal;

public record ProductResponseDTO(Long id,
                                 String name,
                                 BigDecimal salePrice) {
}
