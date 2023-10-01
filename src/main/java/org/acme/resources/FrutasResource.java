package org.acme.resources;

import java.util.List;

import org.acme.dto.CreateFrutaDTO;
import org.acme.model.Frutas;
import org.acme.services.FrutasServices;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("fruta")
public class FrutasResource {
       //http://localhost:8080/q/swagger-ui/ 
    @Inject
    FrutasServices frutasServices;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Frutas> list() {
        return frutasServices.listAll();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public CreateFrutaDTO create(CreateFrutaDTO fruta){
        frutasServices.createOne(fruta);
        return fruta;
    }
}
