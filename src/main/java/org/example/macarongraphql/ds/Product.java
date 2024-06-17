package org.example.macarongraphql.ds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
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
