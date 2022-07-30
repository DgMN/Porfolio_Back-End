
package com.ProfilioFinal.Djaltsyn.Security.Service;

import com.ProfilioFinal.Djaltsyn.Security.Entity.Rol;
import com.ProfilioFinal.Djaltsyn.Security.Enum.RolNombre;
import com.ProfilioFinal.Djaltsyn.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    
    @Autowired
    iRolRepository irolRepository;
    
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
        
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
    
}
