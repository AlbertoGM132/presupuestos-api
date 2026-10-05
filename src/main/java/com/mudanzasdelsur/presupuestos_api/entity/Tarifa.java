package com.mudanzasdelsur.presupuestos_api.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "tarifa")
@Getter
@Setter
@NoArgsConstructor

public class Tarifa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_vehiculo_id", nullable = false)
    private TipoVehiculo tipoVehiculo;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false)
    private Integer kmIncluidosDia;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal precioDia;
}
