package services;

/**
 * Created by olehe on 15-Sep-17.
 *
 */
public class Booking {
    private String bookingId;
    private Kunde kunde;
    private Bord bord;
    private String dato;
    private String tid;
    private String gjester;
    private String forrett;
    private String hovedrett;
    private String dessert;
    private String drikker;

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

    public Bord getBord() {
        return bord;
    }

    public void setBord(Bord bord) {
        this.bord = bord;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getGjester() {
        return gjester;
    }

    public void setGjester(String gjester) {
        this.gjester = gjester;
    }

    public String getForrett() {
        return forrett;
    }

    public void setForrett(String forrett) {
        this.forrett = forrett;
    }

    public String getHovedrett() {
        return hovedrett;
    }

    public void setHovedrett(String hovedrett) {
        this.hovedrett = hovedrett;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getDrikker() {
        return drikker;
    }

    public void setDrikker(String drikker) {
        this.drikker = drikker;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
}
