package org.acme.services;

import java.util.List;

import org.acme.db2model.mysql.Carros;
import org.acme.dto.CreateCarrosDTO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CarrosServices {


    public List<Carros> retornarCarros(){
        return Carros.listAll();
    }

    @Transactional
    public  void inserirCarro(CreateCarrosDTO carro) {
        Carros carrosPersiste = new Carros();
        carrosPersiste.name = carro.name;
        carrosPersiste.persist();
    }
}
