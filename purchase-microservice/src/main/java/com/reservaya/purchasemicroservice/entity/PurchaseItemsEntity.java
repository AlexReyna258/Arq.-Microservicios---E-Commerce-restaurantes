package com.reservaya.purchasemicroservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PurchaseItemsEntity {

    private String idProduct;
    private String name;
    private double price;
    private Integer quantity;
    //private double subtotal;
    /*public void subtotal(){
        this.subtotal = price * quantity;
    }*/
}
