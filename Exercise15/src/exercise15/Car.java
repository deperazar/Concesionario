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
public class Car {
    private String placa;
    private Rueda [] r;
    private Chasis c;
    private Motor m;
    
    public Car(String placa){
        this.placa=placa;
        this.r= new Rueda[4];
    }
    
    int k=0;
    public void addrueda(Rueda r){
        this.r[k]=r;
        k++;
    }
    
    public void addchasis(int numserie, int modelo){
        this.c=new Chasis(numserie,modelo);
    }
    public void addmotor(Motor m){
        this.m=m;
    }
    
    public String showinfo(){
        return "Placa: "+this.placa;
    }
    public String showruedas(){
        String a="";
        String b="";
        String c="";
        String d="";
        
        a="\n Rueda: "+"1"+" Diametro: "+this.r[0].getdiametro()+" Marca: "+this.r[0].getmarca()+"\n";
        b=" Rueda: "+"2"+" Diametro: "+this.r[1].getdiametro()+" Marca: "+this.r[1].getmarca()+"\n";
        c=" Rueda: "+"3"+" Diametro: "+this.r[2].getdiametro()+" Marca: "+this.r[2].getmarca()+"\n";
        d=" Rueda: "+"4"+" Diametro: "+this.r[3].getdiametro()+" Marca: "+this.r[3].getmarca()+"\n";
        
        
        return a+b+c+d;
    }
    public String showchas(){
        return "\n NumSerie Chasis: "+this.c.getnumserie()+"\n Modelo Chasis: "+this.c.getmodelo();
    }
    public String showMotor(){
        return "\n Potencia Motor: "+this.m.gethpower()+"\n Num-Serie Motor: "+this.m.getserien();
    }
    
}
