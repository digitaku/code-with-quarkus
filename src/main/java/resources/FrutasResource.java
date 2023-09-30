package resources;

import java.util.List;

import dto.CreateFrutaDTO;
import entities.Frutas;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import services.FrutasServices;

@Path("/fruta")
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
