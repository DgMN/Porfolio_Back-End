
package com.ProfilioFinal.Djaltsyn.Controller;
import com.ProfilioFinal.Djaltsyn.Entidad.Educacion;
import com.ProfilioFinal.Djaltsyn.Service.EduService;
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
@RequestMapping("/edu")
@CrossOrigin(origins= "https://porfolio-frontent.web.app")
public class EduControl {
    
    @Autowired
    private EduService eduServ; 
    
    
    @PostMapping("/crear")
    public ResponseEntity<Educacion> crearEdu(@RequestBody Educacion edu){
        Educacion nuevaEdu = eduServ.crearEducacion(edu);
        return new ResponseEntity(nuevaEdu,HttpStatus.CREATED);
       
        
    }
    
    @GetMapping("/ver")
    public List<Educacion> traerEducaciones(){
        return eduServ.verEducaciones();
    }
    
    @GetMapping("/buscarEdu/{id}")
    public Educacion buscarPorId(@PathVariable("id") Long id){
       return eduServ.buscarEducacion(id);    
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrarEdu(@PathVariable("id") Long id){
       eduServ.borrarEducacion(id);
    }
    

    @PutMapping("/editar")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion edu){
        
       Educacion updateEdu = eduServ.editarEdu(edu);
       return new ResponseEntity<>(updateEdu, HttpStatus.OK);      
    }   
}
