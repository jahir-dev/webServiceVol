package com.compagnie.db.vol.Repository;

import com.compagnie.db.vol.Model.reservation;
import com.compagnie.db.vol.Model.vol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface reservationRepository extends CrudRepository<reservation,Long> {
    List<reservation> findById_client(int id_client);
}
