package services;

/**
 * Created by olehe on 15-Sep-17.
 *
 */
public class Booking {
    private String bookingId;
    private Kunde kunde;
    private int bord;
    private String tid;
    private int gjester;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public int getBord() {
        return bord;
    }

    public void setBord(int bord) {
        this.bord = bord;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public int getGjester() {
        return gjester;
    }

    public void setGjester(int gjester) {
        this.gjester = gjester;
    }
}
