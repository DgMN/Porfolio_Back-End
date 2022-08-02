/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProfilioFinal.Djaltsyn.Controller;

import com.ProfilioFinal.Djaltsyn.Entidad.AcercaDe;
import com.ProfilioFinal.Djaltsyn.Service.AcercaDeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/acercaDe")
@CrossOrigin(origins="https://porfolio-frontent.web.app")
public class AcercaDeControl {
    
    @Autowired
    AcercaDeService acercaDeServ;
    
    @PostMapping("/crear")
      public ResponseEntity<AcercaDe> crearProyecto(@RequestBody AcercaDe acer){
        AcercaDe nuevaAcerca = acercaDeServ.crearAcerca(acer);
        return new ResponseEntity(nuevaAcerca,HttpStatus.CREATED);       
    }
    
    @GetMapping("/ver")
    public List<AcercaDe> traerAcercaDe(){
        return acercaDeServ.verAcercaDe();
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrarAcerca(@PathVariable("id") Long id){
        acercaDeServ.borrarAcerca(id);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<AcercaDe> editarAcerca(@RequestBody AcercaDe acercaDe){
       AcercaDe updateAcer= acercaDeServ.editarAcerca(acercaDe);
       return new ResponseEntity<>(updateAcer, HttpStatus.OK);
    }
    
     @GetMapping("/id/{id}")
        public AcercaDe getAcercaDe(@PathVariable("id") Long id){
        return acercaDeServ.buscarAcerca(id);
    }  
  
    
}
