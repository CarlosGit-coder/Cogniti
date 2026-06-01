package com.cognito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognito.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
