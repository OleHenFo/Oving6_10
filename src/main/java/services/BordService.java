package services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by olehe on 25-Sep-17.
 *
 */

@Path("/bord")
public class BordService {
    private static Map<String,ArrayList<Integer>> bord = new HashMap<>(999);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<ArrayList<Integer>> checkDate() {
        return bord.values();
    }

    @GET
    @Path("/{date}")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Integer> checkDate(@PathParam("date") String date) {
        return bord.get(date);
    }

    @POST
    @Path("/{date}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void getClichedMessage(@PathParam("date") String date,int b) {
        if (bord.get(date)==null){
            bord.put(date,new ArrayList<Integer>());
        }
        bord.get(date).add(b);
    }
}
