

package nachhilfe_verwaltungs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Nachhilfe_Verwaltungs {

   
    public static void main(String[] args) {
        
     
  LocalDate today= LocalDate.now();

         // Kurs Kursvonschuler =new Kurs;
          
         //Student s1=new Student();         
        // ;
         
       Map<Student, Kurs> meineStudent = new HashMap<>();
       meineStudent.put(new Student("Cemil","Haupschule","6.Klasse"), new Kurs("Mathe"));
       meineStudent.put(new Student("Justus","Gesamtschule","7.Klasse"), new Kurs("English"));
       meineStudent.put(new Student("Justus","Gesamtschule","7.Klasse"), new Kurs("Deutsch")); 
       meineStudent.put(new Student("Jonas","Gymnasium","6.Klasse"), new Kurs("Mathe")); 
        
       for (Map.Entry<Student, Kurs> entry : meineStudent.entrySet()){
        
           System.out.println(" "+entry.getKey()+" " +entry.getValue().getKursName());
       }
       
       
       /*for(Kurs krs : meineStudent.values()){
           System.out.println("Student Name: "+meineStudent.  +"Wert: "+krs.getKursName());
       }*/
       /*
        Student s1=new Student("Cemil","Gesamtschule","6.klasse");  
        s1.personAnmeldung(today);
        
          /* Kursvonschuler[0]=new Kurs();     
           Kursvonschuler[0].setKursName("Mathe");
           Kursvonschuler[1]=new Kurs();     
           Kursvonschuler[1].setKursName("English");
           Kursvonschuler[2]=new Kurs();     
           Kursvonschuler[2].setKursName("Deutsch");           
        s1.setKurs(Kursvonschuler);     */    
       // s1.showKursvonSchule();
       /*
        
        ArrayList<Kurs>alleKurse =new ArrayList<Kurs>();
       
        
           alleKurse.add(new Kurs("Mathe"));
           alleKurse.add(new Kurs("Deutsch"));
           alleKurse.add(new Kurs("English"));
       // Kursvon
         s1.setKurs(alleKurse);
        
       // System.out.println(Kurs);         
         for(Kurs o:alleKurse){
        
            System.out.println("Kurse sind: "+o.getKursName());
        }
        
        */
    }
    
}
