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
public class Motor {
    
    private double hpower;
    private int serien;
    
    public Motor(double hpower, int serien){
        this.hpower=hpower;
        this.serien=serien;
    }
    
    public void sethpower(double hpower){
        this.hpower=hpower;
    }
    
    public void setserien(int serien){
        this.serien=serien;
    }
    
    public int getserien(){
        return this.serien;
                
    }
    public double gethpower(){
        return this.hpower;
    }
    
}
