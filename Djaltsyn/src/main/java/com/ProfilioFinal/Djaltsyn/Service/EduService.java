
package com.ProfilioFinal.Djaltsyn.Service;

import com.ProfilioFinal.Djaltsyn.Entidad.Educacion;
import com.ProfilioFinal.Djaltsyn.Repositorio.EducacionRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EduService{

    @Autowired
    EducacionRepo eduRepo;
    
    
    public List<Educacion> verEducaciones() {
       return eduRepo.findAll();
    }


    public Educacion crearEducacion(Educacion edu) {
       return eduRepo.save(edu);
    }

 
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
    public Educacion editarEdu(Educacion edu){
        return eduRepo.save(edu);
    }
    
}
