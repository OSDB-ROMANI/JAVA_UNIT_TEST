/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orologio;


/**
 *
 * @author Paolo
 */
public class Orologio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GiornoOre orologio = new GiornoOre(16,"11-02-2018"); 
        System.out.println("Giorno "+orologio.GetGiorno());
        System.out.println("Ora "+orologio.getOra());
        orologio.SetGiorno("12-08-2107");        
        System.out.println("Giorno "+orologio.GetGiorno());
    }
    
}
