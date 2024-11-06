package com.proyecto.ga7.services;

import com.proyecto.ga7.model.Usuario;
import com.proyecto.ga7.repository.UsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario newUsuario(Usuario newUsuario) {
        return usuarioRepository.save(newUsuario);
    }

    @Override
    public Iterable<Usuario> getAll() {
       return this.usuarioRepository.findAll();
    }

    @Override
    public Usuario modifyUsuario(Usuario usuario) {
        Optional<Usuario> usuarioEncontrado= this.usuarioRepository.findById(usuario.getIduser());
        if (usuarioEncontrado.get() !=null){
        usuarioEncontrado.get().setNomuser(usuario.getNomuser());
        usuarioEncontrado.get().setApellido(usuario.getApellido());
        usuarioEncontrado.get().setEmail(usuario.getEmail());
        return this.newUsuario(usuarioEncontrado.get());
        
        }
       
        return null;  
    }

    @Override
    public Boolean deleteUsuario(Long iduser) {
        this.usuarioRepository.deleteById(iduser);
        return true;
    }
}
    
    