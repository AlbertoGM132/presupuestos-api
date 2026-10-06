package com.mudanzasdelsur.presupuestos_api.repository;

import com.mudanzasdelsur.presupuestos_api.entity.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarifaRepository extends JpaRepository<Tarifa, Long> {
}
