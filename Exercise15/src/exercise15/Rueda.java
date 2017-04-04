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
public class Rueda {
    private double diametro;
    private String marca;
    
    public Rueda(double diametro,String marca){
        this.diametro=diametro;
        this.marca=marca;
    }
    
       
    public void setdiametro(double diametro){
        this.diametro=diametro;
    }
    
    public void setmarca(String marca){
        this.marca=marca;
    }
    
    public String getmarca(){
        return this.marca;
                
    }
    public double getdiametro(){
        return this.diametro;
    }
    
    public String infor(){
        return " Diametro: "+this.diametro+" Marca: "+this.marca+" ";
    }
}
