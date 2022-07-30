/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProfilioFinal.Djaltsyn.Entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class AcercaDe implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdAcer;
    
    @Column(length= 10000)
    private String descripAcer;

    public AcercaDe(Long IdAcer, String descripAcer) {
        this.IdAcer = IdAcer;
        this.descripAcer = descripAcer;
    }

    public AcercaDe() {
    }
    
    
    
    
}
