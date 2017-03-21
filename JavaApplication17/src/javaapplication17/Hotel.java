/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author Estudiante
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Piso[] store=new Piso[3];
        store[0].setcanthab(4);
        store[1].setcanthab(4);
        store[2].setcanthab(4);
        
        store[0].getcanthab();
        store[2].getcanthab();
        store[3].getcanthab();
        
        int c=store[0].getcanthab()+store[2].getcanthab()+store[3].getcanthab();
        Habitacion[] hab=new Habitacion[c];
        int k=0;
        
        for(int i=0;i<store[0].getcanthab();i++){
            store[0].sethabit(hab[i],i);
            hab[i].setIDhab(1,i);
            k++;
        }
        int l=k;
        
        for(int i=0;i<store[1].getcanthab();i++){
            store[1].sethabit(hab[i+k],i);
            hab[i].setIDhab(2,i);
            l++;
        }
        for(int i=0;i<store[1].getcanthab();i++){
            store[2].sethabit(hab[i+l],i);
            hab[i].setIDhab(3,i);
        }
        
    }
    
    
    
}
