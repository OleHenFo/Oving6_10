package services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by olehe on 15-Sep-17.
 *
 */

@Path("/book")
public class BookingService {
    private static Map<String,Kunde> kunder = new HashMap<>();
    private static Map<String,Booking> bookinger = new HashMap<>();

    @GET
    @Path("/{bookingId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Booking getBooking(@PathParam("bookingId") String bookingId) {
        return bookinger.get(bookingId);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public static String getBookinger() {
        return bookinger.values().toString();
    }

    @POST
    @Path("/{bookingId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addBooking(@PathParam("bookingId") String bookingId, Booking booking){
        bookinger.put(bookingId,booking);
    }

    @DELETE
    @Path("/{bookingId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteBooking(@PathParam("bookingId") String bookingId){
        bookinger.remove(bookingId);
    }
}
