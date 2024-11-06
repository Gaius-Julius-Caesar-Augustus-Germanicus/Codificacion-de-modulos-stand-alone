
package com.proyecto.ga7.controller;

import com.proyecto.ga7.model.Usuario;
import com.proyecto.ga7.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/usuario")
public class UsuarioController {
    
   @Autowired
   private UsuarioService usuarioService;
   
   @PostMapping("/nuevo")
    public Usuario newUsuario(@RequestBody Usuario newUsuario){
        return this.usuarioService.newUsuario(newUsuario);
    }
    @GetMapping("/mostrar")
    public Iterable<Usuario> getAll(){
        return usuarioService.getAll();
    }
    
    @PostMapping("modificar")
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.modifyUsuario(usuario);
    }
    
    @PostMapping (value=("/id"))
    public Boolean deleteUsuario (@PathVariable(value="id") Long id){
        return this.usuarioService.deleteUsuario(id);    }
    
    
         
}
