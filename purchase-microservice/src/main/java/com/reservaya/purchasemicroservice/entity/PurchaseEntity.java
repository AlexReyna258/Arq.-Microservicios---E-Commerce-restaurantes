package com.reservaya.purchasemicroservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(value = "purchase")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PurchaseEntity {

    @Id
    private String idPurchase;
    private @NonNull String idClient;
    private String description;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date timeDate;
    private Double totalPrice;
    private String paymentMetod;
    private @NonNull List<PurchaseItemsEntity> items;

}
