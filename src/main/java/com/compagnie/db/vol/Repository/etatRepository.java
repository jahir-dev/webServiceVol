package com.compagnie.db.vol.Repository;

import com.compagnie.db.vol.Model.etat;
import com.compagnie.db.vol.Model.vol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface etatRepository extends CrudRepository<etat,Long> {

    etat findById_etat(int Id_etat );


}
