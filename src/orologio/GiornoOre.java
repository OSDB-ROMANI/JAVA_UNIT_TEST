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
public class GiornoOre extends Giorno{
    private int ora;

    public GiornoOre(int ora, String giorno) {
        super(giorno);
        this.ora = ora;
    }
    
    public void setOra(int ora){
        this.ora = ora;
    }
    
    public int getOra(){
        return ora;
    }
    
    public boolean getMattina(int ora){
        if(ora < 12) return true;
        return false;
    }
    
}
