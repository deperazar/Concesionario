

package javaapplication17;


public class Habitacion {
    private int capacidadmaxima;
    private String IDhabitacion;
   
    public Habitacion(int cp, String IDhab){
        capacidadmaxima=cp;
        IDhabitacion=IDhab;
     
    }
    
    
    public void setIDhab(int j,int i){
        this.IDhabitacion=j+"0"+i;
    }
}
