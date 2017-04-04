/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise15;

/**
 *
 * @author Estudiante
 */
public class Chasis {
    private int numserie;
    private int modelo;
    
    public Chasis(int numserie, int modelo){
        this.numserie=numserie;
        this.modelo=modelo;
    }
    
    public void setnumserie(int numserie){
        this.numserie=numserie;
    }
    
    public void setmodelo(int modelo){
        this.modelo=modelo;
    }
    
    public int getnumserie(){
        return this.numserie;
    }
    
    public int getmodelo(){
        return this.modelo;
    }
    
    
}
