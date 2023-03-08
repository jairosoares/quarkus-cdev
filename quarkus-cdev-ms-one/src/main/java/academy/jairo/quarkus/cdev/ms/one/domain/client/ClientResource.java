package academy.jairo.quarkus.cdev.ms.one.domain.client;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/client")
public class ClientResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Client> getAll() {
        return Client.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("findById")
    public Client findById(@QueryParam("id") long id) throws InterruptedException {
        //Thread.sleep(5000);
        return Client.findById(id);
    }

    @DELETE
    @Transactional
    @Path("deleteById")
    public void deleteById(long id) {
        Client.deleteById(id);
    }

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Client client) {
        client.id = null;
        client.persist();
        return Response.status(Response.Status.CREATED).entity(client).build();
    }

}
