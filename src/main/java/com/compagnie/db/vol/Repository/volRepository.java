package com.compagnie.db.vol.Repository;

import com.compagnie.db.vol.Model.reservation;
import com.compagnie.db.vol.Model.vol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface volRepository extends CrudRepository<vol,Long> {
    vol findById_vol(int id_vol);
    vol findByDate_departAndVille_arrivee(Date Date_depart, String Ville_arrivee);

}
