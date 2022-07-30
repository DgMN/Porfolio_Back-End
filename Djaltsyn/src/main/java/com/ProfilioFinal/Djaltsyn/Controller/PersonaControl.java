
package com.ProfilioFinal.Djaltsyn.Controller;

import com.ProfilioFinal.Djaltsyn.Entidad.Persona;
import com.ProfilioFinal.Djaltsyn.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins="http://localhost:4200")
public class PersonaControl {
    
    @Autowired
    private IPersonaService IperSer;
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public String agregarPersona(@RequestBody Persona per){
        IperSer.crearPersona(per);  
        return "La pesona fue creada correctamente";
    }
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Persona> verPersonas(){
        return IperSer.verPersonas();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public String borrarPersona(@PathVariable("id") Long id){
        IperSer.borrarPerson(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public ResponseEntity<Persona> editarPersona(@RequestBody Persona persona){
        
       Persona updatePersona = IperSer.editarPersona(persona);
       return new ResponseEntity<>(updatePersona, HttpStatus.OK);
       
    }

    @GetMapping("/id/{id}")
    public Persona getPersona(@PathVariable("id") Long id){
        return IperSer.bucarPersona(id);
    }   
}
