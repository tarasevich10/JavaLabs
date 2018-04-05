import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/instruments")
public class InstrumentService {

    private static Map<Integer, Secateur> instruments = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Secateur getInstrument(@PathParam("id") Integer id) {
        return instruments.get(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createInstrument(Secateur secateur) {
        instruments.put(secateur.getId(), secateur);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void replaceInstrument(@PathParam("id") Integer id, Secateur secateur) {
        instruments.replace(id, secateur);
    }

    @DELETE
    @Path("/{id}")
    public void deleteInstrument(@PathParam("id") Integer position) {
        instruments.remove(position);
    }
}