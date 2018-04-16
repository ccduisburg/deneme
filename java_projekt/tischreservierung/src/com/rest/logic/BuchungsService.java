/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.logic;

import com.rest.model.TischDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ckabakci
 */
public class BuchungsService {

    private List<Tisch> alleTische;
    private TischDao td;

    /**
     * TODO:Festlegen, woher die Info über alle Tische kommt Hier Änderung
     * sobald Datenquellen fest gelegt sind
     */
    public BuchungsService(TischDao td) {
        alleTische = td.getAllTisch();
        this.td = td;
        //Wird zukünftig durch eine geeignete getMethode ersetzt

    }

    /**
     * Tisch buchen für eine Anzahl von Personen Liefert den ersten gefunden
     * Tisch zurück, auch wenn dieser viel größer ist liefert null zurück, wenn
     * kein passender Tisch gefunden wurft
     */
    public Tisch buchen(int person) {

        for (Tisch tisch : alleTische) {
            if (!tisch.istBelegt() && tisch.getPlatze() >= person) {
                System.out.println("test buchen: "+tisch);
                tisch.setBelegt(true);
                return tisch;
            }
        }
        return null;
    }

    /**
     *
     * @param person
     * @param quali
     * @return
     */
    public Tisch buchen(int person, double quali) {
        for (Tisch tisch : alleTische) {
            if (!tisch.istBelegt() && tisch.getPlatze() >= person && tisch.getBewertung() <= quali) {

                tisch.setBelegt(true);
                return tisch;
            }
        }
        return null;
    }
}
