/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProfilioFinal.Djaltsyn.Service;

import com.ProfilioFinal.Djaltsyn.Entidad.AcercaDe;
import com.ProfilioFinal.Djaltsyn.Repositorio.AcercaDeRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AcercaDeService {
    @Autowired
    AcercaDeRepo acercaDeRepo;
    
    
    public List<AcercaDe> verAcercaDe() {
       return acercaDeRepo.findAll();
    }

    public AcercaDe crearAcerca(AcercaDe acercaDe) {
       return acercaDeRepo.save(acercaDe);
    }
 
    public void borrarAcerca(Long id) {
        acercaDeRepo.deleteById(id);
    }
    
    public AcercaDe buscarAcerca(Long id) {
        return acercaDeRepo.findById(id).orElse(null);
    }
    
    public AcercaDe editarAcerca(AcercaDe acercaDe){
        return acercaDeRepo.save(acercaDe);
    }    
}
