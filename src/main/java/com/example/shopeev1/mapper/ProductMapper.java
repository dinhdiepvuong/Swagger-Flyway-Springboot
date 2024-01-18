package com.example.shopeev1.mapper;

import com.example.shopeev1.data.Product;
import com.example.shopeev1.dto.ProductDTO;

public class ProductMapper {

    public static Product mapEntityToDto(ProductDTO productDTO){
        Product product = new Product(
                productDTO.getId(),
                productDTO.getName(),
                productDTO.getPrice(),
                productDTO.getImage(),
                productDTO.getSummary()
        );
        return product;
    }

    public static ProductDTO mapDtoToEntity(Product product){
        ProductDTO productDTO = new ProductDTO(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getImage(),
                product.getSummary()
        );
        return productDTO;
    }
}
