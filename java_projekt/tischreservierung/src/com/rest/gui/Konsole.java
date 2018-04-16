/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.gui;

import com.rest.logic.BuchungsService;
import com.rest.logic.Tisch;
import java.util.Scanner;

/**
 *
 * @author ckabakci
 */
public class Konsole {
    private BuchungsService bs;
    private Scanner scan;
    private Tisch reservieret;
    //Konstuktor
    public Konsole(BuchungsService bs){
    this.bs=bs;
    scan=new Scanner(System.in);
    navigation();
    
    }

    //Methoden

    private void navigation() {
        System.out.println("************Wilkommen, was können wir für Sie tun?*******\n" 
                + "***1***: Buchen mit Personenzahl\n"
                + "***2***: Buchen mit Personenzahl und Qualität\n"
                + "***3***: Tisch bewerten");
        int auswahl=scan.nextInt();//Hier eigentlich Sicherung, dass Fehleingaben abgefangen werden
               switch(auswahl){
                   case 1:
                       buchenMitPersonen();
                       break;
                   case 2:
                       buchenMitQuali();
                   case 3:
                      bewerten();
                   default:
                       System.out.println("vielen Dank, dass Sie über unsere Service gebucht habe.");
                       return;
               }
               navigation();
    }
    private void bewerten(){
        if(reservieret==null){
            System.out.println("Vielen Dank, dass Sie über unseren Service gabucht haben.");
        }else {
        
            System.out.println("Wie gut hat Ihnen Tisch gefallen, bitte bewerten Sie von 1-5");
            int bewertung=scan.nextInt();
            reservieret.bewerten(bewertung);//der Tsich ist für sein Attribute zuständig
            System.out.println("vielen Dank für Die Bewertung des Tischs Nr: "+reservieret.getTischNr()+" Er hat jetzt die Bewertung: "+reservieret.getBewertung());
       reservieret=null;
        }
    
    }
    private void buchenMitQuali(){
        int anzahlPerson,mindestBewertung;
        System.out.println("Wie viele Personen werden kommen?");
        anzahlPerson=scan.nextInt();
        System.out.println("Wie gut soll der Tisch sein? Bitte wählen Sie von 1-5");
        mindestBewertung=scan.nextInt();
        this.reservieret=bs.buchen(anzahlPerson,mindestBewertung);
     if (this.reservieret!=null){
            System.out.println("Vielen Dank, derTisch Nr: "+this.reservieret.getTischNr()+" wurde für Sie reserviert");
            System.out.println("Tischinfos: "+this.reservieret);
        }
        else{
            System.out.println("Leider ist derzeit kein Tisch in der gewünschte Größe verfügbar, bitte versuchen Sie später erneut ");
        }
            
    }
    private void buchenMitPersonen(){
        int anzahlPerson=0;
        System.out.println("Wie viele Personen kommen? ");
        anzahlPerson=scan.nextInt();
        this.reservieret=bs.buchen(anzahlPerson);
        if (this.reservieret!=null){
            System.out.println("Vielen Dank, derTisch Nr: "+this.reservieret.getTischNr()+" wurde für Sie reserviert");
            System.out.println("Tischinfos: "+this.reservieret);
        }
        else{
            System.out.println("Leider ist derzeit kein Tisch in der gewünschte Größe verfügbar, bitte versuchen Sie später erneut ");
        }
        
    
    }
}
