package com.reservaya.bookingmicroservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Document(value = "booking")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BookingEntity {
    @Id
    private String idReserva;
    private String idRestaurante;
    private String idCliente;
    private String telefonoContacto;
    private String tipoMesa;
    private int cantidadPersonas;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date fechaHora;
    private String informacionAdicional;
}
