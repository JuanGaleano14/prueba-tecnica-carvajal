package com.prueba.carvajal.domain.repository;

import com.prueba.carvajal.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String username);

}
