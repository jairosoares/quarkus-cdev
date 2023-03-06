package academy.jairo.quarkus.cdev.ms.two.domain.reserve;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/reserve")
public class ReserveResource {

    @GET
    public List<Reserve> getAll() {
        return Reserve.listAll();
    }

    @Transactional
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Reserve reserve) {
        reserve.id = null;
        reserve.persist();
        return Response.status(Response.Status.CREATED).entity(reserve).build();
    }

}
