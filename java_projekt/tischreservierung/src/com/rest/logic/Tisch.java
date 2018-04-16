/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.logic;

/**
 *Diese Tish sollen reserviert werden, dabei muss die Anzahl der Gäste kontrolliert werden.
 * Reservierte Tisch können werden
 * @author ckabakci
 */
public class Tisch {
    private int plaetze;
    /**
     * Anfänglich ist die Bewertung auf 0. wenn ein Gast zufrieden ist kann er bis zu 5 punkte vergeben.
     * Die Bewertung stellt den Durchschnitt aller bisherigen Bewertungen dar.
     */
    private double bewertung;
    /**
     * Dient der Berechnung des Durchschnitts;
     */
    private int anzahlBewertungen;
    /**
    * Diese Tischnummer kann später von der Datenbank erzeugt werden...
    */
    private int tischNr;
    /**
     *Ein reservierter Tisch wird ab der Abgabe der Bewertung fre gegeben. 
     */
    private boolean beleget=false;
    
    
    
}
