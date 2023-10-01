package org.acme.services;

import java.util.List;

import org.acme.dto.CreateFrutaDTO;
import org.acme.model.Frutas;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class FrutasServices {

    public List<Frutas> listAll() {
        return Frutas.listAll();
    }

    @Transactional
    public void createOne(CreateFrutaDTO frutas){
        Frutas newFruta = new Frutas();

        newFruta.nome = frutas.nome;
        newFruta.quantidade = frutas.quantidade;
        newFruta.persist();
    }
    
}
