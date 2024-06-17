package org.example.macarongraphql.service;

import lombok.RequiredArgsConstructor;
import org.example.macarongraphql.dao.ProductDao;
import org.example.macarongraphql.dto.ProductDto;
import org.example.macarongraphql.util.EntityUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductDao productDao;

    public List<ProductDto> getAllProducts() {
        return productDao.findAll()
                .stream()
                .map(EntityUtil::toProductDto)
                .collect(Collectors.toUnmodifiableList());
    }

    public ProductDto findProductById(String id) {
        return EntityUtil.toProductDto(productDao.findById(id)
                .orElseThrow(RuntimeException::new));
    }

    public ProductDto addProduct(ProductDto productDto) {
        return EntityUtil.toProductDto(productDao.save(EntityUtil.toProduct(productDto)));
    }
}
