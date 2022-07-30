/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProfilioFinal.Djaltsyn.Service;

import com.ProfilioFinal.Djaltsyn.Entidad.Persona;
import com.ProfilioFinal.Djaltsyn.Repositorio.PersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    PersonaRepositorio persoRepo; 
    

    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }
    
     @Override
    public void borrarPerson(Long id) {
        persoRepo.deleteById(id);
        }

    @Override
    public Persona bucarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public Persona editarPersona(Persona per) {
        return persoRepo.save(per);
    }

   
    
}
