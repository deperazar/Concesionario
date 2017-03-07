


package javaapplication12;


public class Automovil {
    
    private String marca;
    private int año;
    private String modelo;
    private Llanta[] tire;
    private Motor engine;
    private Puerta[] cardoor;
    
    public Automovil(String m, int a, String mo,Llanta [] t,Motor e,Puerta[] d){
        marca=m;
        año=a;
        modelo=mo;
        
        if(t.length==4){
            tire=t;
        }
        if(d.length==2){
            cardoor=d;
        }
        engine=e;
    }
    
    public void setMarca(){
        this.marca=marca;
    }
    public void setAño(){
        this.año=año;
    }
    public void setModelo(){
        this.modelo=modelo;
    }
    public String getMarca(){
        return marca;
    }
    public int getAño(){
        return año;
    }
    public String getModelo(){
        return modelo;
    }
            
    
    
}
