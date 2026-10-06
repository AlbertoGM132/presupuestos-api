package com.mudanzasdelsur.presupuestos_api.repository;

import com.mudanzasdelsur.presupuestos_api.entity.Configuracion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfiguracionRepository extends JpaRepository<Configuracion, Long> {
}
