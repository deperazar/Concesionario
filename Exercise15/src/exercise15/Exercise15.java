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
public class Exercise15 {

    
    public static void main(String[] args) {
        
        Persona p1=new Persona("David Suarez",0213654);
        
        Rueda r1=new Rueda(15,"Firestone");
        Rueda r2=new Rueda(15,"Firestone");
        Rueda r3=new Rueda(16,"Firestone");
        Rueda r4=new Rueda(16,"Firestone");
    
        Rueda r5=new Rueda(13,"Firestone");
        Rueda r6=new Rueda(13,"Firestone");
        Rueda r7=new Rueda(18,"Firestone");
        Rueda r8=new Rueda(18,"Firestone");
               
        Motor m1=new Motor(300,12345);
        Motor m2=new Motor(500,02541);
        
        Car c1= new Car("HNM321");
        Car c2= new Car("GYB341");
        
        c1.addchasis(1425, 1960);
        c1.addmotor(m1);
        c1.addrueda(r1);
        c1.addrueda(r2);
        c1.addrueda(r3);
        c1.addrueda(r4);
       
        c2.addchasis(5142, 1986);
        c2.addmotor(m2);
        c2.addrueda(r5);
        c2.addrueda(r6);
        c2.addrueda(r7);
        c2.addrueda(r8);
        
        p1.addcar(c1);
        p1.addcar(c2);
        
        //Impresion
        
        System.out.println(p1.showinformation()+"\n");
        System.out.println(p1.showinforma());
        
        /*do{
            int i=0;
        }while(i<5);*/
        
                
        
    }
    
}
