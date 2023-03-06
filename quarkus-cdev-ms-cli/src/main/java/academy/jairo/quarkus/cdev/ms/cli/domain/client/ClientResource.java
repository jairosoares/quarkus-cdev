package academy.jairo.quarkus.cdev.ms.cli.domain.client;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/client-cli")
public class ClientResource {

    @Inject
    @RestClient
    ClientService clientService;

    @GET
    @Path("createClient")
    public Response getCreateClient() {

        Client client = Client.of(99, "Thor");
        return clientService.createClient(client);

    }

}
