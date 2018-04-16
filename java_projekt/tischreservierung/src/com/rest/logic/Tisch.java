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
    private boolean belegt=false;
    /**
     * hier wird die Anzahl der plätze am Tisch festgelegt.
     * @param stuehle ist Anzahl der Plätze dieses Tisch
     */
    public Tisch(int stuehle){
    this.plaetze=stuehle;
    }
    public int getPlatze(){
    return plaetze;
    
    }
    public double getBewertung(){
    return bewertung;
    }
    public int getTischNr(){
    return tischNr;
    }
    public void setTischNr(int tischNr){
    this.tischNr=tischNr;
    
    }
    public int getAnzahlBewertungen(){
    return anzahlBewertungen;
    
    }
    public boolean istBelegt(){
    return belegt;
    }
    
    public void setBelegt(boolean belegt){
    this.belegt=belegt;
    
    }
    public void bewerten(double bewertung){
    double temp=this.bewertung*anzahlBewertungen;   
    temp+=bewertung;
    this.anzahlBewertungen++;
    this.bewertung=temp/anzahlBewertungen;
    //Tisch soll nach Bewertung fre gegeben werden
    this.belegt=false;
    }
    @Override
    public String toString(){
    
    return "Tisch [Plätze: "+this.plaetze+" Bewertung: "+this.bewertung+" Tischnummer: "+this.tischNr+"]";
            }
    
}
