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

@Path("/path")
public class BookingService {
    private static Map<String,Booking> bookinger = new HashMap<>();

    @GET
    @Path("/{bookingId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Booking getBooking(@PathParam("bookingId") String bookingId) {
        return bookinger.get(bookingId);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Booking> getBookinger() {
        return bookinger.values();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addKunde(Booking booking) {
        bookinger.put(booking.getBookingId(), booking);
    }

    @DELETE
    @Path("/{bookingId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteBooking(@PathParam("bookingId") String bookingId){
        bookinger.remove(bookingId);
    }
}
