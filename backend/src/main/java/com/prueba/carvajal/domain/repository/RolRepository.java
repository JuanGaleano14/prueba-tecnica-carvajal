package com.prueba.carvajal.domain.repository;

import com.prueba.carvajal.infrastructure.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol,Long> {
}
