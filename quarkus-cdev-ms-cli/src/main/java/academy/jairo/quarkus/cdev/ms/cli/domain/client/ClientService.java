package academy.jairo.quarkus.cdev.ms.cli.domain.client;

import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.temporal.ChronoUnit;

@RegisterRestClient(baseUri = "http://localhost:8181/client")
public interface ClientService {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createClient(Client client);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("findById")
    // fault-tolerance with fallback method
    @Timeout(unit = ChronoUnit.SECONDS, value = 3)
    @Fallback(fallbackMethod = "fallback")
    @CircuitBreaker(
            requestVolumeThreshold = 4,
            failureRatio = .5,
            delay = 6000,   // 6 seconds
            successThreshold = 1    // if one success close circuit
    )
    public Client findById(@QueryParam("id") long id);

    /*
        The method fallback should be the same signature as the method findById
     */
    private Client fallback(long id) {
        return Client.of(0,"Opts! Timeout and fallback method called");
    }

}
