package academy.jairo.quarkus.cdev.cli.domain.reserve;

import academy.jairo.quarkus.cdev.cli.domain.client.Client;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RegisterRestClient(baseUri = "http://localhost:8080/reserve")
public interface ReserveService {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createReserve(Reserve reserve);

}
