package com.reservaya.productmicroservice.entity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class RestaurantEntity {
    private String idRestaurante;
    private String nombre;
    private String distrito;
}

