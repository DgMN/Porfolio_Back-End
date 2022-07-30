/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProfilioFinal.Djaltsyn.Service;

import com.ProfilioFinal.Djaltsyn.Entidad.Skills;
import com.ProfilioFinal.Djaltsyn.Repositorio.SkillsRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillsService {
    
    @Autowired
    SkillsRepo skillRepo;
    
     public List<Skills> verSkills() {
       return skillRepo.findAll();
    }


    public Skills crearSkills(Skills skill) {
        return skillRepo.save(skill);
    }

 
    public void borrarSkills(Long id) {
        skillRepo.deleteById(id);
    }

    
    public Skills buscarSkills(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
    
    public Skills editarSkills(Skills skill){
        return skillRepo.save(skill);
    }
    
    
    
}
