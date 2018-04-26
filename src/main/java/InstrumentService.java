import persistence.dao.ToolDao;

import javax.inject.Inject;
import javax.tools.Tool;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/instruments")
public class InstrumentService {

    @Inject
    private ToolDao dao;

    private static Map<Integer, Secateur> instruments = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Tool getInstrument(@PathParam("id") Integer id) {
        return dao.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Tool createInstrument(Tool tool) {
        //instruments.put(secateur.getId(), secateur);
        dao.persist(tool);
        return tool;
    }
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response replaceInstrument(@PathParam("id") Integer id, Tool tool) {
       // instruments.replace(id, secateur);
        dao.update(tool);
        return Response.ok().build();

    }

    @DELETE
    @Path("/{id}")
    public void deleteInstrument(@PathParam("id") Integer position) {
        //instruments.remove(position);
        dao.remove(position);
    }
}