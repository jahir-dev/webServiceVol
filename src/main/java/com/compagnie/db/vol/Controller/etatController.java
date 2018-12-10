package com.compagnie.db.vol.Controller;
import com.compagnie.db.vol.Model.etat;
import com.compagnie.db.vol.Repository.etatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/etat")
public class etatController {

    @Autowired
    private etatRepository etatRepository;

    //Get etat by id_etat
    @RequestMapping(value="/getetat/{id_etat}")
    public etat getetatByid(@PathVariable int id_etat){
        return etatRepository.findById_etat( id_etat);
    }



}
