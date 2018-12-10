package com.compagnie.db.vol.Model;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_reservation;

    private int id_vol;
    private int id_client;
    private Date date_reservation;
    private int nb_place;


    public reservation(int id_vol, int id_client, Date date_reservation, int nb_place) {
        this.id_vol = id_vol;
        this.id_client = id_client;
        this.date_reservation = date_reservation;
        this.nb_place = nb_place;
    }


    public int getId_reservation() {
        return id_reservation;
    }

    public void setId_reservation(int id_reservation) {
        this.id_reservation = id_reservation;
    }

    public int getId_vol() {
        return id_vol;
    }

    public void setId_vol(int id_vol) {
        this.id_vol = id_vol;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public Date getDate_reservation() {
        return date_reservation;
    }

    public void setDate_reservation(Date date_reservation) {
        this.date_reservation = date_reservation;
    }

    public int getNb_place() {
        return nb_place;
    }

    public void setNb_place(int nb_place) {
        this.nb_place = nb_place;
    }
}
