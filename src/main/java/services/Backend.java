package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Date;

/**
 * Created by olehe on 15-Sep-17.
 *
 */

@Path("/path")
public class Backend {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTimeDate() {
        return new Date().toString();
    }
}
