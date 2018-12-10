package com.compagnie.db.vol.Controller;


import com.compagnie.db.vol.Model.client;
import com.compagnie.db.vol.Repository.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping (path = "/client")
public class clientController {

    @Autowired
    private clientRepository clientRepository;

    // connexion d'un client
    @RequestMapping(
            value = "/connexion",
            method = RequestMethod.POST)
    public Object connexion (@RequestBody Map<String, Object> payload ) {

        String login = (String) payload.get("login");
        String password = (String) payload.get("password");

        client cl = clientRepository.findByLoginAndPassword(login, password);


        if (cl != null) {
            List<Object> result = new ArrayList<Object>();
            result.add("client");
            result.add(cl);
            return new ResponseEntity<Object>(result, HttpStatus.OK);

        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
