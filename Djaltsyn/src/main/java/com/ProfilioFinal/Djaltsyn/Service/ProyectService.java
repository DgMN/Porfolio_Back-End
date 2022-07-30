
package com.ProfilioFinal.Djaltsyn.Service;

import com.ProfilioFinal.Djaltsyn.Entidad.Proyectos;
import com.ProfilioFinal.Djaltsyn.Repositorio.ProyectosRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectService {
    
    @Autowired
    ProyectosRepo proRepo;
    
       public List<Proyectos> verProyectos() {
       return proRepo.findAll();
    }


    public Proyectos crearProyectos(Proyectos proy) {
        return proRepo.save(proy);
    }

 
    public void borrarproyectos(Long id) {
        proRepo.deleteById(id);
    }

    
    public Proyectos buscarProyectos(Long id) {
        return proRepo.findById(id).orElse(null);
    }
    
    public Proyectos editarProyectos(Proyectos proy){
        return proRepo.save(proy);
    }
  
    
}
