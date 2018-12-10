package com.compagnie.db.vol.Repository;


import com.compagnie.db.vol.Model.client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clientRepository extends CrudRepository<client,Integer> {

    client findByLoginAndPassword(String login,String password);
}
