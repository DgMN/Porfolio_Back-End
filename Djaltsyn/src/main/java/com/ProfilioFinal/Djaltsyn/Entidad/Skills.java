
package com.ProfilioFinal.Djaltsyn.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    
    private String nombreSkill;
    private String imgSkill;
    private int progresoSkill;
    private String color1;
    private String color2;
    private String color3;

    public Skills(Long idSkill, String nombreSkill, String imgSkill, int progresoSkill, String color1, String color2, String color3) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.imgSkill = imgSkill;
        this.progresoSkill = progresoSkill;
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
    }
    
    public Skills() {
    }
       
}
