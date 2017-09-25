package services;

import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by olehe on 25-Sep-17.
 *
 */

@Path("/bord")
public class BordService {
    private Map<String,ArrayList<Integer>> bord = new HashMap<>();

    @GET
    @Path("/{date}")
    @Produces("text/plain")
    public ArrayList<Integer> checkDate(@PathParam("date") String date) {
        return bord.get(date);
    }

    @POST
    @Path("/{date}")
    @Consumes("text/plain")
    public void getClichedMessage(@PathParam("date") String date,int bord) {
        this.bord.get(date).add(bord);
    }
}
