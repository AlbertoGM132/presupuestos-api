package com.mudanzasdelsur.presupuestos_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "presupuesto_vehiculo")
@Getter
@Setter
@NoArgsConstructor

public class PresupuestoVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "presupuesto_id", nullable = false)
    private Presupuesto presupuesto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tarifa_id", nullable = false)
    private Tarifa tarifa;

    @Column(nullable = false)
    private Integer dias;

    @Column(nullable = false)
    private Integer kmTotales;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal subtotal;

}
