package com.compagnie.db.vol.Model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "vol")

public class vol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_vol;

    private Date date_depart;
    private Date date_arrivee;
    private Time heur_depart;
    private Time heur_arrivee;
    private String ville_depart;
    private String ville_arrivee;
    private float prix;
    private float duree;
    private int nb_place;
    private int nb_place_reservee;
    private String etat;


    public vol(Date date_depart, Date date_arrivee, Time heur_depart, Time heur_arrivee, String ville_depart, String ville_arrivee, float prix, float duree, int nb_place, int nb_place_reservee, String etat) {
        this.date_depart = date_depart;
        this.date_arrivee = date_arrivee;
        this.heur_depart = heur_depart;
        this.heur_arrivee = heur_arrivee;
        this.ville_depart = ville_depart;
        this.ville_arrivee = ville_arrivee;
        this.prix = prix;
        this.duree = duree;
        this.nb_place = nb_place;
        this.nb_place_reservee = nb_place_reservee;
        this.etat = etat;
    }

    public String getVille_depart() {
        return ville_depart;
    }

    public void setVille_depart(String ville_depart) {
        this.ville_depart = ville_depart;
    }

    public String getVille_arrivee() {
        return ville_arrivee;
    }

    public void setVille_arrivee(String ville_arrivee) {
        this.ville_arrivee = ville_arrivee;
    }

    public int getId_vol() {
        return id_vol;
    }

    public void setId_vol(int id_vol) {
        this.id_vol = id_vol;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public Date getDate_arrivee() {
        return date_arrivee;
    }

    public void setDate_arrivee(Date date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    public Time getHeur_depart() {
        return heur_depart;
    }

    public void setHeur_depart(Time heur_depart) {
        this.heur_depart = heur_depart;
    }

    public Time getHeur_arrivee() {
        return heur_arrivee;
    }

    public void setHeur_arrivee(Time heur_arrivee) {
        this.heur_arrivee = heur_arrivee;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getDuree() {
        return duree;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    public int getNb_place() {
        return nb_place;
    }

    public void setNb_place(int nb_place) {
        this.nb_place = nb_place;
    }

    public int getNb_place_reservee() {
        return nb_place_reservee;
    }

    public void setNb_place_reservee(int nb_place_reservee) {
        this.nb_place_reservee = nb_place_reservee;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
