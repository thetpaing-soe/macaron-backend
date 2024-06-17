package org.example.macarongraphql.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private String id;
    private String name;
    private String imageName;
    private String slug;
    private double price;
    private String details;
    private String sku;
    private String ingredients;
    private String weight;
    private String delivery;
}
