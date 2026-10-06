package com.mudanzasdelsur.presupuestos_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "presupuesto")
@Getter
@Setter
@NoArgsConstructor
public class Presupuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;
    @Column(nullable = false)
    private String dirOrigen;
    @Column(nullable = false)
    private String dirDestino;

    private LocalDate fechaMudanza;

    @Column(nullable = false)
    private LocalDate fechaEmision;

    @Column(nullable = false)
    private LocalDate fechaValidez;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoPresupuesto estado = EstadoPresupuesto.PENDIENTE;

    @Column(nullable = false)
    private Integer numOperarios;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal peajes = BigDecimal.ZERO;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal dietas = BigDecimal.ZERO;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal alojamiento = BigDecimal.ZERO;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal costeTotal;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal precioTotal;

}
