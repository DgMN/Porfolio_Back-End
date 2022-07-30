/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProfilioFinal.Djaltsyn.Controller;


import com.ProfilioFinal.Djaltsyn.Entidad.Skills;
import com.ProfilioFinal.Djaltsyn.Service.SkillsService;
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
@RequestMapping("/skills")
@CrossOrigin(origins= "http://localhost:4200")
public class SkillsControl {
    
    
    @Autowired
    private SkillsService skillServ;
    
     @PostMapping("/crear")
    public ResponseEntity<Skills> crearEdu(@RequestBody Skills skill){
        Skills nuevoSkill =  skillServ.crearSkills(skill);
       return new ResponseEntity(nuevoSkill, HttpStatus.CREATED);
        
    }
    
    @GetMapping("/ver")
    public List<Skills> traerSkills(){
        return skillServ.verSkills();
    }
    
    @GetMapping("/buscarEdu/{id}")
    public Skills buscarPorId(@PathVariable("id") Long id){
       return skillServ.buscarSkills(id);    
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrarEdu(@PathVariable("id") Long id){
       skillServ.borrarSkills(id);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Skills>  editarSkills(@RequestBody  Skills skill){
        Skills updateSkill = skillServ.editarSkills(skill);
        return new ResponseEntity<>(updateSkill, HttpStatus.OK);                                    
    }   
}
