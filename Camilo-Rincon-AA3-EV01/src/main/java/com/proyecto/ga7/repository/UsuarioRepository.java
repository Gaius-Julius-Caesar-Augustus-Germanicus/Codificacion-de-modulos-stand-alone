package com.proyecto.ga7.repository;


import com.proyecto.ga7.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
