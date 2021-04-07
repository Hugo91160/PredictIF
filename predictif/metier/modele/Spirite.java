/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insalyon.dasi.predictif.metier.modele;

import javax.persistence.*;

/**
 *
 * @author alex
 */
@Entity
@Table(name="Spirite")
public class Spirite extends Medium{
    private String support;
    
    public Spirite(String denomination, String genre, String presentation, String support) {
        super(denomination, genre, presentation);
        this.support = support;
    }
    
}
