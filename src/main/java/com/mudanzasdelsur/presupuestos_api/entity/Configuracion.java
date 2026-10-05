package com.mudanzasdelsur.presupuestos_api.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "configuracion")
@Getter
@Setter
@NoArgsConstructor

public class Configuracion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal precioHoraOperario;
    @Column(nullable = false, precision = 10, scale = 3)
    private BigDecimal precioGasoil;
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal margenPct;
    @Column(nullable = false)
    private Integer IvaPct;
}
