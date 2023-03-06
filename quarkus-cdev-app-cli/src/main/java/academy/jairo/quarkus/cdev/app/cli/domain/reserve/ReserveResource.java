package academy.jairo.quarkus.cdev.app.cli.domain.reserve;

import academy.jairo.quarkus.cdev.app.cli.domain.client.Client;
import academy.jairo.quarkus.cdev.app.cli.domain.client.ClientService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/reserve-cli")
public class ReserveResource {

    @Inject
    @RestClient
    ClientService clientService;

    @Inject
    @RestClient
    ReserveService reserveService;

    @GET
    @Path("createReserve")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCreateReserve() {

        Client client = clientService.findById(1);

        Reserve reserve = Reserve.of(0, client);

        return reserveService.createReserve(reserve);

    }


}
