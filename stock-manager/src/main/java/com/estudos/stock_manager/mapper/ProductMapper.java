package com.estudos.stock_manager.mapper;

import com.estudos.stock_manager.dto.ProductRequestDTO;
import com.estudos.stock_manager.dto.ProductResponseDTO;
import com.estudos.stock_manager.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product toEntity(ProductRequestDTO dto);

    ProductResponseDTO toResponse(Product product);

}
