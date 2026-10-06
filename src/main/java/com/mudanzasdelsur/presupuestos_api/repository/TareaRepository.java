package com.mudanzasdelsur.presupuestos_api.repository;

import com.mudanzasdelsur.presupuestos_api.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
