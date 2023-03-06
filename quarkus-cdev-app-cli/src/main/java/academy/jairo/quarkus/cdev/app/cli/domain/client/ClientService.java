package academy.jairo.quarkus.cdev.app.cli.domain.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RegisterRestClient(baseUri = "http://localhost:8080/client")
public interface ClientService {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createClient(Client client);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("findById")
    public Client findById(@QueryParam("id") long id);

}
