/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProfilioFinal.Djaltsyn.Repositorio;

import com.ProfilioFinal.Djaltsyn.Entidad.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeRepo extends JpaRepository<AcercaDe,Long>{
    
}
