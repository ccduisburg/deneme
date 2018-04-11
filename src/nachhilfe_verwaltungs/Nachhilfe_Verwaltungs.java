

package nachhilfe_verwaltungs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


public class Nachhilfe_Verwaltungs {

   
    public static void main(String[] args) {
        
     
  LocalDate today= LocalDate.now();

      
        
  
         // Kurs Kursvonschuler =new Kurs;
          
          
         //Student s1=new Student();         
        // ;
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
        
        List<Kurs>alleKurse =new ArrayList<Kurs>();
       
        
           alleKurse.add(new Kurs("Mathe"));
           alleKurse.add(new Kurs("Deutsch"));
           alleKurse.add(new Kurs("English"));
       // Kursvon
    //    s1.setKurs(Kurs);
        
       // System.out.println(Kurs);         
         for(Kurs o:alleKurse){
        
            System.out.println("Kurse sind: "+o.getKursName());
        }
        
        
    }
    
}
