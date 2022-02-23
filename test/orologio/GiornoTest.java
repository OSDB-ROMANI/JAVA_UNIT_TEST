/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orologio;

import static org.junit.Assert.*;
import org.junit.Test;



/**
 *
 * @author Paolo
 */
public class GiornoTest {
    
    public GiornoTest() {
    }

    @Test
    public void giornoTest() {
        Giorno g = new Giorno("01-01-2022");
        String giornoAttero = "01-01-2022";
        assertNotNull("è nullo",g);
        assertEquals("Il giorno non è quello attero", giornoAttero,g.GetGiorno());
    }
}
