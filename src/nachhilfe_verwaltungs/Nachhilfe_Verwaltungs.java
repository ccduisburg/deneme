package nachhilfe_verwaltungs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import nachhilfe_verwaltungs.Menu;

public class Nachhilfe_Verwaltungs {
    
    
    
        
    public static void MenuCall(int wahl) {
 
    switch (wahl) {
        
       case 10: 
       {           
        System.out.println("Wilkommen Nachhilfe Verwaltungsprogram!!");
        ArrayList mainMenuAttr = new ArrayList<>();
        mainMenuAttr.add("1. Student Verwaltung");
        mainMenuAttr.add("2. Lehre Verwaltung");
        mainMenuAttr.add("3. Kurs Verwaltung");
        mainMenuAttr.add("4. Auflisten");
        mainMenuAttr.add("10. Exit");
        Menu m = new Menu();
        m.set(mainMenuAttr);
        m.setRamen("*");
        m.drawmenu();
        System.out.println("Bitte geben Sie ihren wunsch ein..:");
        //-------- ------------------------------------------------
        break;
    }
       case 1:
        {
        System.out.println("Wilkommen Studentverwaltungsmenu!!");
        ArrayList StudentMenuAttr = new ArrayList<>();
        StudentMenuAttr.add("1. Für neue die Student Anmeldung");
        StudentMenuAttr.add("2. Für den Kurs registrieren");
        StudentMenuAttr.add("3. Für Student kungigung");
        StudentMenuAttr.add("4. Für Kurs entfernen von Student");
        StudentMenuAttr.add("5. Für Auflisten");
        StudentMenuAttr.add("10. Rückker zum Main Menü");
        Menu m1 = new Menu();
        m1.set(StudentMenuAttr);        
        m1.setRamen("*");
        m1.drawmenu();
        System.out.println("Bitte ihren Wunsch eingeben...:");
        break;
  }
        case 2:
        {
        System.out.println("Wilkommen Lehreverwaltungsmenu!!");
        ArrayList StudentMenuAttr = new ArrayList<>();
        StudentMenuAttr.add("1. Für neue die Lehre Anmeldung");
        StudentMenuAttr.add("2. Für den Kurs registrieren");
        StudentMenuAttr.add("3. Für dei Lehre kungigung");
        StudentMenuAttr.add("4. Für Kurs entfernen von Lehre");
        StudentMenuAttr.add("5. Für Auflisten");
        StudentMenuAttr.add("10. Rückker zum Main Menü");
        Menu m1 = new Menu();
        m1.set(StudentMenuAttr);        
        m1.setRamen("*");
        m1.drawmenu();
        System.out.println("Bitte ihren Wunsch eingeben...:");
        break;
  }
        case 3:{
        System.out.println("Wilkommen Kursverwaltungsmenu!!");
        ArrayList StudentMenuAttr = new ArrayList<>();
        StudentMenuAttr.add("1. Für neue die Kurs Erstellung");
        StudentMenuAttr.add("2. Für den Kurs registrieren");
        StudentMenuAttr.add("3. Für die Kurs entwernung");       
        StudentMenuAttr.add("4. Für Auflisten");
        StudentMenuAttr.add("10. Rückker zum Main Menü");
        Menu m1 = new Menu();
        m1.set(StudentMenuAttr);        
        m1.setRamen("*");
        m1.drawmenu();
        System.out.println("Bitte ihren Wunsch eingeben...:");
        break;
        
    }
        //System.out.println("Invalid month number");
    default: {
     
        System.out.println("Invalid number");
           break;
    }
    
    }
    
    }
    public static void main(String[] args) {
        
          LocalDate today = LocalDate.now();

         MenuCall(10);                  
        Scanner reader=new Scanner(System.in);
        int auswahl =reader.nextInt();
       // while(auswahl!=10){
            
           //  MenuCall(auswahl);
          
                       
        switch (auswahl) {
        
       case 1:    {
       
        MenuCall(auswahl);  
            
            reader=new Scanner(System.in);
            auswahl =reader.nextInt();
           // Student s1 = new Student("cemil", "Gymnasium", "6. Klasse");
              break;
       }
       case 2:  {
      
           MenuCall(auswahl);        
            reader=new Scanner(System.in);
            auswahl =reader.nextInt();
            
           break;}
       case 3:  {
           MenuCall(auswahl);        
           reader=new Scanner(System.in);
            auswahl =reader.nextInt();
           break;}
       case 4:  {
           MenuCall(auswahl);        
             reader=new Scanner(System.in);
            auswahl =reader.nextInt();
           break;}        
       case 5:  {
           MenuCall(auswahl);        
            reader=new Scanner(System.in);
            auswahl =reader.nextInt();
           break;}
       case 10:  {
           //MenuCall(auswahl);        
           // reader=new Scanner(System.in);
            //auswahl =reader.nextInt();
           break;
       }
       
        default: MenuCall(auswahl);
            
              
           
        }
    
      
     
        }  
        

     

    /*
        Kurs k1=new Kurs("Mathe");
        k1.anmeldung(student);
        Student s1 = new Student("cemil", "Gymnasium", "6. Klasse");
        s1.personAnmeldung(today);
        Student s2 = new Student("Jonas", "Gymnasium", "5.Klasse");

        List<Student> alleStudent = new ArrayList<Student>();

        List<Kurs> alleKurse = new ArrayList<Kurs>();
        alleKurse.add(new Kurs("Mathe"));
        alleKurse.add(new Kurs("English"));
        alleKurse.add(new Kurs("Deutsch"));

        s1.setKurs(alleKurse);
        s2.setKurs(alleKurse);
        s2.setGekundigt(true);

       // s1.KursKundigen(alleKurse.get(1));
         
        alleStudent.add(s1);
        alleStudent.add(s2);

        Scanner name = new Scanner(System.in);
        String sname = name.nextLine();
        for (Student s : alleStudent) {
            if (s.getName().equals(sname)) {
                s.setGekundigt(true);                
                alleStudent.remove(s);                
            }
        }

        /*
        Kurs []kursAnmelden= new Kurs[3];
        kursAnmelden[0]=new Kurs();
        kursAnmelden[0].setKursName("Mathe");
        kursAnmelden[1]=new Kurs();
        kursAnmelden[1].setKursName("English");
        kursAnmelden[2]=new Kurs();
        kursAnmelden[2].setKursName("Deutsch");
     */
 /* Lehre l1 = new Lehre("Ahmet", 16);
        l1.personAnmeldung(today);

        l1.setKurs(alleKurse);
        l1.showKurszumLehre();

        /*Student s1=new Student("Cemil",today,"Gesamtschule","6.klasse");
        s1.schuleAnmeldung("Cemil", today);
     */
    // s1.setKurs(kursAnmelden);
    /*  s1.showKursvonSchule();
        
        for (Student s : alleStudent) {
            if (s.getName().equals(sname)) {
                s.setGekundigt(true);                
                alleStudent.remove(s);                
            }
        
     */
}



