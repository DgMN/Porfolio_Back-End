
package com.ProfilioFinal.Djaltsyn.Controller;

import com.ProfilioFinal.Djaltsyn.Entidad.Proyectos;
import com.ProfilioFinal.Djaltsyn.Service.ProyectService;
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
@RequestMapping("/proyectos")
@CrossOrigin(origins="http://localhost:4200")
public class ProyectosControl {
    
    
    @Autowired
    private ProyectService proServ;
    
    @PostMapping("/crear")
      public ResponseEntity<Proyectos> crearProyecto(@RequestBody Proyectos proy){
        Proyectos nuevoProy = proServ.crearProyectos(proy);
        return new ResponseEntity(nuevoProy,HttpStatus.CREATED);       
    }
    
    @GetMapping("/ver")
    public List<Proyectos> traerEducaciones(){
        return proServ.verProyectos();
    }
    
    @GetMapping("/buscarPro/{id}")
    public Proyectos buscarPorId(@PathVariable("id") Long id){
       return proServ.buscarProyectos(id);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrarProyect(@PathVariable("id") Long id){
       proServ.borrarproyectos(id);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Proyectos> editarProyectos(@RequestBody Proyectos proy){
        
       Proyectos updateProy = proServ.editarProyectos(proy);
       return new ResponseEntity<>(updateProy, HttpStatus.OK);      
    }   
    
    
}
