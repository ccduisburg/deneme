/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tischreservierung;

import com.rest.gui.Konsole;
import com.rest.logic.BuchungsService;
import com.rest.model.TischDao;
import com.rest.model.TischDaoListImpl;

/**
 *
 * @author ckabakci
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TischDao tischDao= new TischDaoListImpl();
        BuchungsService bs=new BuchungsService(tischDao);
        Konsole gui= new Konsole(bs); 
        
        
    }
    
}
