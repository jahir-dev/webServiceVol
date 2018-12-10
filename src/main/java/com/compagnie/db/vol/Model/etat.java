package com.compagnie.db.vol.Model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "etat")

public class etat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_etat;

    private String libelle;


    public etat(String libelle) {
        this.libelle = libelle;
    }

    public int getId_etat() {
        return id_etat;
    }

    public void setId_etat(int id_etat) {
        this.id_etat = id_etat;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

