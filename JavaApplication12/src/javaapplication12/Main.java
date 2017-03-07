/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

public class Main {
    
    public static void main(String[] args){
        Llanta [] xs=new Llanta [4];
        xs[0]=new Llanta("Firestone",21,"XN124");
        xs[1]=new Llanta("Firestone",21,"XN124");
        xs[2]=new Llanta("Goodyear",21,"XN137");
        xs[3]=new Llanta("Goodyear",21,"XN137");
        
        Puerta[] door=new Puerta[2];
        door[0]=new Puerta("Tijera");
        door[1]=new Puerta("Tijera");
       
        Motor eng=new Motor("Nx120-12",8); 
        
        Puerta [] puert=new Puerta[4];
        Automovil car= new Automovil(" Lexus",2010," Lx-590", xs ,eng,puert );
        
        System.out.println(car.getAño()+car.getMarca()+car.getModelo());
        System.out.println(xs[1].getMarcall());
        
        
    }
    
    
}
