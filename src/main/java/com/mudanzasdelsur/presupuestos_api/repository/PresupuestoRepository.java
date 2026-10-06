package com.mudanzasdelsur.presupuestos_api.repository;

import com.mudanzasdelsur.presupuestos_api.entity.Presupuesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresupuestoRepository extends JpaRepository<Presupuesto, Long> {
}
