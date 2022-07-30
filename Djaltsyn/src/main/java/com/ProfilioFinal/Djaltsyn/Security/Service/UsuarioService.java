/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProfilioFinal.Djaltsyn.Security.Service;

import com.ProfilioFinal.Djaltsyn.Security.Entity.Usuario;
import com.ProfilioFinal.Djaltsyn.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepistory;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepistory.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUSuario(String nombreUsuario){
        return iusuarioRepistory.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail(String email){
        return iusuarioRepistory.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        iusuarioRepistory.save(usuario);
    }
}
