package com.compagnie.db.vol.Controller;

import com.compagnie.db.vol.Model.reservation;
import com.compagnie.db.vol.Repository.reservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/reservation")
public class reservationController {

    @Autowired
    private reservationRepository reservationRepository;


    //liste des reservation par clienr
    @RequestMapping(value="/allres/{id_clt}")
    public <list>reservation getreservationbyclient(@PathVariable int id_clt){
        return (reservation) reservationRepository.findById_client(id_clt);
    }

// reserver
    @PostMapping("/create")
    public reservation createreservation(@Valid @RequestBody reservation reservation) {
        System.out.println("Create reservation: " );
        return reservationRepository.save(reservation);
    }


// delete reservation
    @DeleteMapping("/delete/{id_res}")
    public ResponseEntity<String> deleteEnseignant(@PathVariable("id_res") long id_res) {
        System.out.println("Delete reservation ");

       reservationRepository.deleteById(id_res);
        return new ResponseEntity<>("reservation has been deleted!", HttpStatus.OK);
    }



}
