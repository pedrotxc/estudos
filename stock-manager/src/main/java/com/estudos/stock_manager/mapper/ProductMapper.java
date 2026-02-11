package com.estudos.stock_manager.mapper;

import com.estudos.stock_manager.dto.ProductRequest;
import com.estudos.stock_manager.model.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product toModel(ProductRequest product);
}
