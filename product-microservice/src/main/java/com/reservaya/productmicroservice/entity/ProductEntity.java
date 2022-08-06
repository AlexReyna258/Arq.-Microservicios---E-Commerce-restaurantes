package com.reservaya.productmicroservice.entity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(value = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ProductEntity {

    @Id
    private String idProduct;
    private String imageURL;
    private String name;
    private String description;
    private Double rating;
    private Double price;
    private RestaurantEntity restaurant;
}

