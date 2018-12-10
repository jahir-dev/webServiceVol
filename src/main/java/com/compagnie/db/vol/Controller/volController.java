package com.compagnie.db.vol.Controller;

import com.compagnie.db.vol.Model.reservation;
import com.compagnie.db.vol.Model.vol;
import com.compagnie.db.vol.Repository.volRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/vol")
public class volController {
    @Autowired
    private volRepository volRepository;
    //Consulter la list des vols
    @GetMapping(value = "/all")
    public List<vol> getAllVol() {
        System.out.println("Get all vol...");
        return (List<vol>) volRepository.findAll();
    }


    //get vol by id
    @RequestMapping(value="/vol/{id_vol}")
    public vol getvolbyid(@PathVariable int id_vol){
        return (vol) volRepository.findById_vol(id_vol);
    }

    //liste vol by date and ville
   /* @RequestMapping(value="/vol/{date_arrivee}{ville_arrivee}")
    public <list>reservation getreservationbyclient(@PathVariable int id_clt){
        return (reservation) volRepository.findById_client(id_clt);
    }*/
}
