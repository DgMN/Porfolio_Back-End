
package com.ProfilioFinal.Djaltsyn.Entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProyect;
    
    private String tituloProyect;
    
    @Column(length= 3000)
    private String descripProyect;
    
     @Column(length= 1000)
    private String fotoProyect;
     
    private String linkProyect;

    public Proyectos() {
    }

    public Proyectos(Long idProyect, String tituloProyect, String descripProyect, String fotoProyect, String linkProyect) {
        this.idProyect = idProyect;
        this.tituloProyect = tituloProyect;
        this.descripProyect = descripProyect;
        this.fotoProyect = fotoProyect;
        this.linkProyect= linkProyect;
    }
    
    
    
}
