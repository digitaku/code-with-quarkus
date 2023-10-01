package org.acme.resources;

import java.util.List;

import org.acme.db2model.mysql.Carros;
import org.acme.dto.CreateCarrosDTO;
import org.acme.services.CarrosServices;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("carro")
public class CarroResource {

    @Inject
    CarrosServices services;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Carros> buscarCarros() {
       return services.retornarCarros();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public CreateCarrosDTO inserirCarro(CreateCarrosDTO carro){
        services.inserirCarro(carro);
        return carro;
    }
}
