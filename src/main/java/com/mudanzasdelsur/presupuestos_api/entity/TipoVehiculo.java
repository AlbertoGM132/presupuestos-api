package com.mudanzasdelsur.presupuestos_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "tipo_vehiculo")
@Getter
@Setter
@NoArgsConstructor

public class TipoVehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(name = "consumo_l_100km", nullable = false, precision = 10, scale = 2)
    private BigDecimal consumoL100km;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal precioKmExtra;
}
