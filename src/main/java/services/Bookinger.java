package services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by olehe on 15-Sep-17.
 *
 */

@Path("/bookinger/")
public class Bookinger {
    private static Map<String,Booking> bookinger = new HashMap<>();
    private static final int ant_bord = 5;

    @GET
    @Path("/{bookingId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Booking getBooking(@PathParam("bookingId") String bookingId) {
        if (!bookinger.containsKey(bookingId)) {
            throw new javax.ws.rs.NotFoundException();
        }
        return bookinger.get(bookingId);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public static Collection<Booking> getBookinger() {
        return bookinger.values();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addBooking(Booking booking){
        bookinger.put(booking.getBookingId(),booking);
    }

    @DELETE
    @Path("/{bookingId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteBooking(@PathParam("bookingId") String bookingId){
        bookinger.remove(bookingId);
    }
}
