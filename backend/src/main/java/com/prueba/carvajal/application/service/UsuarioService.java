package com.prueba.carvajal.application.service;

import com.prueba.carvajal.infrastructure.entity.Usuario;
import com.prueba.carvajal.infrastructure.entity.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
