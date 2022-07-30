/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProfilioFinal.Djaltsyn.Service;

import com.ProfilioFinal.Djaltsyn.Entidad.Persona;
import java.util.List;



public interface IPersonaService {
    
    public List <Persona> verPersonas();
    
    public void crearPersona(Persona per);
    
    public void borrarPerson(Long id);
    
    public Persona bucarPersona(Long id);
    
    public Persona editarPersona(Persona per);
    
}
