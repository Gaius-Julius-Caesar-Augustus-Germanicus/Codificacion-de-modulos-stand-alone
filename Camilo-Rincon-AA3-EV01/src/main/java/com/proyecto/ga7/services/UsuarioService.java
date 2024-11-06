package com.proyecto.ga7.services;

import com.proyecto.ga7.model.Usuario;




public interface UsuarioService {
    Usuario newUsuario (Usuario newusuario);
    Iterable<Usuario> getAll();
    Usuario modifyUsuario(Usuario usuario);
    Boolean deleteUsuario ( Long iduser);
    
}
