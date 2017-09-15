package services;

/**
 * Created by olehe on 15-Sep-17.
 *
 */
public class Kunde {
    private String kundeId;
    private String navn;
    private String kortnr;
    private String ut_dato;
    private String kontrol;

    public String getKundeId() {
        return kundeId;
    }

    public void setKundeId(String kundeId) {
        this.kundeId = kundeId;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getKortnr() {
        return kortnr;
    }

    public void setKortnr(String kortnr) {
        this.kortnr = kortnr;
    }

    public String getUt_dato() {
        return ut_dato;
    }

    public void setUt_dato(String ut_dato) {
        this.ut_dato = ut_dato;
    }

    public String getKontrol() {
        return kontrol;
    }

    public void setKontrol(String kontrol) {
        this.kontrol = kontrol;
    }
}
