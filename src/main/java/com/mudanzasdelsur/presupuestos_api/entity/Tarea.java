package com.mudanzasdelsur.presupuestos_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tarea")
@Getter
@Setter
@NoArgsConstructor

public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 200)
    private String nombre;

    @Column(nullable = false)
    private Integer minutosEstimados;
}
