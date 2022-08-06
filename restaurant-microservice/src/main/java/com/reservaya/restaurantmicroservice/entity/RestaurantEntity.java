package com.reservaya.restaurantmicroservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(value = "restaurant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class RestaurantEntity {
    @Id
    private String idRestaurante;
    private String imagenURL;
    private String correo;
    private String contraseña;
    private String nombre;
    private String ruc;
    private String telefono;
    private String distrito;
    private String direccion;
    private List<String> serviciosAcionales;
    private String tipoRestaurante;
    private String horarioApertura;
    private String horarioCierre;
}
