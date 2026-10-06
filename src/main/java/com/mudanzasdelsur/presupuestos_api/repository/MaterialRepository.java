package com.mudanzasdelsur.presupuestos_api.repository;

import com.mudanzasdelsur.presupuestos_api.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Long> {
}
