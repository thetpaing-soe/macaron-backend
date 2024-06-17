package org.example.macarongraphql.controller;

import lombok.RequiredArgsConstructor;
import org.example.macarongraphql.dto.ProductDto;
import org.example.macarongraphql.service.ProductService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @QueryMapping
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }

    @QueryMapping
    public ProductDto getProductById(@Argument String id) {
        return productService.findProductById(id);
    }
}
