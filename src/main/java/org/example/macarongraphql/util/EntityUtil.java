package org.example.macarongraphql.util;

import org.example.macarongraphql.ds.Product;
import org.example.macarongraphql.dto.ProductDto;
import org.springframework.beans.BeanUtils;

public class EntityUtil {

    public static ProductDto toProductDto(Product product) {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }

    public static Product toProduct(ProductDto productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return product;
    }
}
