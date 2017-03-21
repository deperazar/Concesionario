/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;


public class Piso {
    private int canthabit;
    private int numpiso;
    private Habitacion [] room;
    
    public Piso(int quanhab){
        if(quanhab<6){
            room = new Habitacion[quanhab];
            canthabit=quanhab;
                        
        }
              
    }
    
    
    public void setcanthab(int a){
        if(a<6){
            canthabit=a;
        }
    }
    public int getcanthab(){
        return canthabit;
    }
        
    public void addHabit(int g,int cp,String IDhab ){
        room[g]=new Habitacion(cp,numpiso+"0"+IDhab);
    }
}

