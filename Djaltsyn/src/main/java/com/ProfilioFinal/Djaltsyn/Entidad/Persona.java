
package com.ProfilioFinal.Djaltsyn.Entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable= false, updatable= false)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String descripcion;
    private String img;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy="idEdu")
    private List<Educacion> eduList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy="idSkill")
    private List<Skills> skillsList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy="idProyect")
    private List<Proyectos> proyectList;
    
    

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String titulo, String descripcion, String img) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img = img;
    }

    

  
    
    
    
    
}
