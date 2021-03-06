/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insalyon.dasi.PredictIF.predictif.metier.modele;

import java.time.LocalTime;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author
 */
@Entity
@Table(name = "Consultation")
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Employe employe;
    @ManyToOne
    private Medium medium;
    private String commentaire;
    
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employe getEmploye() {
        return employe;
    }
    
    public Consultation(Date dateDebut, Client client, Employe employe, Medium medium) {
        this.dateDebut = dateDebut;
        this.client = client;
        this.employe = employe;
        this.medium = medium;

        this.commentaire = null;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
    
        public Date getDateFin() {
        return dateFin;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public Consultation() {
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date date) {
        this.dateDebut = date;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Medium getMedium() {
        return medium;
    }
    
    
}
