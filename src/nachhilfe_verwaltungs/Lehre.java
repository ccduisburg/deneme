package nachhilfe_verwaltungs;

import java.time.LocalDate;
import java.util.Date;
import nachhilfe_verwaltungs.Kundigen;

public class Lehre extends Person implements Kundigen {

    private Date beginDatum;
    private double stLohn;
    private boolean gekundigt;
    private LocalDate anmeldeDatum;

    
    @Override
       public void personAnmeldung(LocalDate anmeldeDatum) {
        this.anmeldeDatum = anmeldeDatum;
        gekundigt = false;
    }
    public Date getBeginDatum() {
        return beginDatum;
    }

    public void setBeginDatum(Date beginDatum) {
        this.beginDatum = beginDatum;
    }

    public double getStLohn() {
        return stLohn;
    }

    public void setStLohn(double stLohn) {
        this.stLohn = stLohn;
    }

    public boolean isGekundigt() {
        return gekundigt;
    }

    @Override
    public boolean getGekundigt() {
        return gekundigt;
    }

    @Override
    public void setGekundigt(boolean gekundigt) {
        this.gekundigt = gekundigt;
    }
/*
    public void lehreAngestelen(String name, Date beginDatum) {
        this.name = name;
        this.setBeginDatum(beginDatum);
    }
*/
}
