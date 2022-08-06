package com.reservaya.clientmicroservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ClientEntity {

    @Id
    private String idClient;
    private String email;
    private String password;
    private String name;
    private String lastName;
    private String direction;
    private String phone;

}
