/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orologio;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;




/**
 *
 * @author Paolo
 */
@RunWith(Parameterized.class)
public class ParaGiornoOraTest {
    private int oraTest;
    private boolean risultato;
    
    @Parameterized.Parameters
    public static Collection datiTest(){
        return Arrays.asList(new Object[][]{
        new Object[] {1, true},
        new Object[] {2, true},
        new Object[] {5, true},
        new Object[] {11, true},
        new Object[] {12, false},
        new Object[] {15, false},
        new Object[] {18, false},
        new Object[] {24, false},
        });
    }
    public ParaGiornoOraTest(int oraTest, boolean risultato){
        super();
        this.oraTest = oraTest;
        this.risultato = risultato;
    }

    @Test
    public void oraTest() {
        //al fine dell'esempio i valori iniziali non sono rilevanti
        GiornoOre go = new GiornoOre(0,"");
        assertEquals("Non è mattina", risultato,go.getMattina(oraTest));
    }
}
